# JavaSE_Journey
Java_sse




### git使用小技巧
配置git步骤
先新建项目或者打开项目
初始化一个git仓库，初始化一个远程仓库（选中readme之后会导致有提交，不能提交）
commit 到本地仓库
push 粘贴进入远程仓库地址
命令端口键入: git pull --rebase origin main(这个命令的含义是从远程仓库拉取最新的更改，并在本地的更改之上重新应用（rebase）这些更改)
进行push提交
直接先建仓库，然后直接用就可以不用换分支

##### bug
无法 git clone 来自 Github 上的仓库，报端口 443 错误

Git 所设端口与系统代理不一致，需重新设置
# 注意修改成自己的IP和端口号
打开 设置 --> 网络与Internet --> 查找代理
记录下当前系统代理的 IP 地址和端口号
git config --global http.proxy http://127.0.0.1:7890
git config --global https.proxy http://127.0.0.1:7890
