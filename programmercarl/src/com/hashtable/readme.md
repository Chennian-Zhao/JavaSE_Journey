`get` 方法和 `getOrDefault` 方法都是 Java `Map` 接口的方法，它们都用于从映射中获取指定键的值。但是，它们在键不存在于映射中时的行为是不同的。

**get 方法**

`get(Object key)` 方法返回映射中指定键的值。如果映射中不包含该键的映射关系，则返回 `null`。

**getOrDefault 方法**

`getOrDefault(Object key, V defaultValue)` 方法返回映射中指定键的值。如果映射中不包含该键的映射关系，则返回默认值 `defaultValue`。

总的来说，`get` 方法在键不存在时返回 `null`，而 `getOrDefault` 方法在键不存在时返回一个默认值。

**Set**

在 Java 中，`Set` 是一个接口，它继承了 `Collection` 接口。它是一个不包含重复元素的集合。也就是说，每个元素在一个 `Set` 中只能出现一次。`Set` 接口有多个实现类，如 `HashSet`、`LinkedHashSet` 和 `TreeSet`。

**HashSet**

`HashSet` 是 `Set` 接口的一个实现类。它不保证元素的顺序，允许有一个 null 元素。`HashSet` 是基于哈希表的，所以它的插入和查询操作都是常数时间复杂度。

**LinkedHashSet**

`LinkedHashSet` 是 `HashSet` 的一个子类，它保留了插入元素的顺序。其他方面，它和 `HashSet` 是相同的。

**TreeSet**

`TreeSet` 是 `Set` 接口的另一个实现类。它的元素是有序的，它使用红黑树来存储元素。`TreeSet` 的插入和查询操作的时间复杂度是 O(log n)。

**List**

`List` 是 `Collection` 接口的一个子接口。它是一个有序的集合，可以包含重复的元素。`List` 接口有多个实现类，如 `ArrayList`、`LinkedList` 和 `Vector`。

**ArrayList**

`ArrayList` 是 `List` 接口的一个实现类。它是基于动态数组的，所以它的随机访问操作是常数时间复杂度，但是插入和删除操作可能需要移动元素，所以它们的时间复杂度是 O(n)。

**LinkedList**

`LinkedList` 是 `List` 接口的另一个实现类。它是基于双向链表的，所以它的插入和删除操作是常数时间复杂度，但是随机访问操作的时间复杂度是 O(n)。

**Vector**

`Vector` 是 `List` 接口的另一个实现类。它和 `ArrayList` 很相似，但是它是线程安全的。