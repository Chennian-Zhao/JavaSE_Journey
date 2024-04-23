public class test {
    public boolean transferNode(Stmt stmt, CPFact in, CPFact out) {
        // TODO - finish me

        // if no definition happens, use identity function
        if (!(stmt instanceof DefinitionStmt<?, ?> definitionStmt)) { return out.copyFrom(in); }

        LValue lValue = definitionStmt.getLValue();
        RValue rValue = definitionStmt.getRValue();

        // temporarily only consider assignment to variable
        // use identity function for other occasions
        if (!(lValue instanceof Var key)) { return out.copyFrom(in); }

        // focus on type "int"
        if (rValue instanceof Var var) {
            if (!canHoldInt(var)) { return out.copyFrom(in); }
        } else if (rValue instanceof BinaryExp binaryExp) {
            if (!(canHoldInt(binaryExp.getOperand1()) && canHoldInt(binaryExp.getOperand2()))) {
                return out.copyFrom(in);
            }
        } else if (rValue instanceof NegExp negExp) {
            if (!canHoldInt(negExp.getOperand())) {
                return out.copyFrom(in);
            }
        }

        // evaluate the abstract value of rValue expression and update the map
        CPFact temp = in.copy();
        temp.update(key, evaluate(rValue, in));
        return out.copyFrom(temp);
    }
    public boolean transferNode(Stmt stmt, CPFact in, CPFact out) {
        // TODO - finish me

        // if no definition happens, use identity function
        if (!(stmt instanceof DefinitionStmt<?, ?> definitionStmt)) { return out.copyFrom(in); }

        LValue lValue = definitionStmt.getLValue();
        RValue rValue = definitionStmt.getRValue();

        // temporarily only consider assignment to variable
        // use identity function for other occasions
        if (!(lValue instanceof Var key)) { return out.copyFrom(in); }

        // focus on type "int"
        if (rValue instanceof Var var) {
            if (!canHoldInt(var)) { return out.copyFrom(in); }
        } else if (rValue instanceof BinaryExp binaryExp) {
            if (!(canHoldInt(binaryExp.getOperand1()) && canHoldInt(binaryExp.getOperand2()))) {
                return out.copyFrom(in);
            }
        } else if (rValue instanceof NegExp negExp) {
            if (!canHoldInt(negExp.getOperand())) {
                return out.copyFrom(in);
            }
        }

        // evaluate the abstract value of rValue expression and update the map
        CPFact temp = in.copy();
        temp.update(key, evaluate(rValue, in));
        return out.copyFrom(temp);
    }
    public boolean transferNode(Stmt stmt, CPFact in, CPFact out) {
        // TODO - finish me
        CPFact new_out = new CPFact();
        new_out.copyFrom(in);
        /*
         * 首先判断def是否存在以及是否是Var，还要判断是否是Int
         * 删除in中与stmt中redefine的变量
         */
        Optional<LValue> def = stmt.getDef();
        if (def.isPresent() && def.get() instanceof Var) {
            //new_out.update((Var) def.get(), Value.getUndef());
            if (canHoldInt((Var) def.get())) {
                DefinitionStmt<?, ?> definitionStmt = (DefinitionStmt<?, ?>)stmt;
                if (definitionStmt.getRValue() instanceof Exp)
                    new_out.update((Var) def.get(), evaluate(definitionStmt.getRValue(), in));
                else
                    new_out.update((Var) def.get(), Value.getNAC());
            }
        }
        if (new_out.equals(out))
            return true;
        else {
            // clear out or not?
            out.clear();
            out.copyFrom(new_out);
            return false;
        }
    }
    public boolean transferNode(Stmt stmt, CPFact in, CPFact out) {
        boolean equalFlag;

        if (stmt instanceof DefinitionStmt defStmt && defStmt.getLValue() instanceof Var lVar) {
            CPFact newOut = in.copy();

            if (canHoldInt(lVar)) {
                RValue rValue = defStmt.getRValue();
                Value lAbstractValue = evaluate(rValue, in);
                newOut.update(lVar, lAbstractValue);
            }
            else
                newOut.update(lVar, Value.getUndef());

            equalFlag = newOut.equals(out);
            if (!equalFlag)
                out.copyFrom(newOut);

        }
        // Identity function
        else {
            equalFlag = out.equals(in);
            if (!equalFlag)
                out.copyFrom(in);
        }
        return !equalFlag;
    }

    }
 



