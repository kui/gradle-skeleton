gradle-skeleton
==================

[Gradle][] でマルチプロジェクトしたいときのスケルトン。

[Gradle]: http://www.gradle.org/ "Gradle - Build Automation Evolved"

eclipse へのインポート
-------------------

```sh
mv gradle-skeleton myproject
cd myproject
gradle eclipse
```

このようにコマンドを実行した後、eclipse から通常のプロジェクトとして
インポートする。

ただし、eclipse に [groovy plugin][] をインストールしている場合は、
`gradle eclipse` を実行しなくても "Gradle Project" として
インポートできるようになる。

[groovy plugin]: http://groovy.codehaus.org/Eclipse+Plugin "Groovy - Eclipse Plugin"


参考になりそうなもの
------------------------

* [Gradle ドキュメント](http://www.gradle.org/docs/current/userguide/userguide.html)
* [Gradle ドキュメント（和訳）](http://gradle.monochromeroad.com/docs/userguide/userguide.html)
