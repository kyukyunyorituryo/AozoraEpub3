改造版AozoraEpub3
============

改造版の説明
------------
[電書協EPUB3制作ガイド](http://ebpaj.jp/counsel/guide)のEPUBに近づけることを目的としたフォーク版。
AozoraEpub3を電子出版目的に使う場合に、審査が通るように修正している。EPUBバリデーションを通すのと、多くのEPUBビュワーで表示に問題がないようにすることを目的としている。



Read this in other languages: [English](https://github.com/kyukyunyorituryo/AozoraEpub3/blob/master/README.en.md)

ダウンロード
============
 [リリースページ](https://github.com/kyukyunyorituryo/AozoraEpub3/releases)をクリックしてダウンロードしてください。

支援のお願い
============
個人で開発しているので、開発継続のために支援していただければと思います。

[GitHub Sponsors](https://github.com/sponsors/kyukyunyorituryo)

[欲しい物リスト](https://www.amazon.co.jp/gp/registry/wishlist/PP7F9RZJ1B0Y/ref=nav_wishlist_lists_1)

[Kindle商品サイト](https://kyukyunyorituryo.github.io/kindle_sale/)

サイトから購入するとアフィリエイト収益が入ります。


説明
------------
青空文庫の注記入りテキストファイルをePub3ファイルに変換するツールです。
・青空文庫txtのテキスト+画像ファイル(またはzip)をePub3に変換
・Web小説のHTMLを取得して青空文庫txt形式で保存してからePub3に変換
・画像zip/rarをePub3に変換
が可能です。


利用上の注意
------------
利用は自己責任でお願いします。
* 現状、いくつか対応していない注記があります。
* 青空文庫の注記仕様外の注記等で変換したxhtmlエラーで章ごと表示されない場合があります。
* 4バイト文字を出力すると対応していない端末では外字以降表示されない場合があります。
  （変換しないオプション選択時は注記を小書きで表示）

バグや変換できない注記があった配布サイトで報告お願いします。


変換時の注意
------------
コメントの異常、対応していない注記、変換できなかった外字は変換時のログに表示されるので適宜元テキストを修正してください。
- 仕様外や一部の揺らぎのある注記は対応しません。
- 外字注記内で外字注記が使われている場合はエラーになります（対応予定無し）
  →※［＃「姉」の正字、「女＋※［＃第3水準1-85-57］のつくり」 とログに出たら
    該当部分の元テキストを ※［＃「姉」の正字、U+59CA］に修正
- 注記内に注記がある底本コメント注記は削除してください


動作環境
------------
Java 21 以降のOpenJDKでJava 21を推奨　https://adoptium.net/temurin/releases/

Javaライセンスの問題からAdoptiumでビルドすることにします。Oracle JAVAまたは、OpenJDKを利用してください。AdoptiumのJavaではインストール時にパスが通るので使いやすい。

https://adoptium.net/temurin/releases/

Windowsの場合はOperating System：Windows、Architecture：x64、Package Type：JRE、Version：21を選んでインストールしてください。今後さらに新しくする場合もあります。

　Linux版のkindlegenの配布が終了されました。そのため、mobiへの変換はLinuxではできなくなりました。


使い方
------------
#### インストール
　AozoraEpub3-*.zip を任意のフォルダに解凍します。

#### 起動
　AozoraEpub3.jar をダブルクリックして実行します。
　またはコンソールから "java -jar AozoraEpub3.jar" でも実行可。
 
　※javaが見えなければフルパスで指定
 
　　例: "C:\Program Files\Eclipse Adoptium\jre-21.0.1.12-hotspot\bin/java.exe" -jar AozoraEpub3.jar

#### 変換
　表示されたアプレットに、変換したい青空文庫テキストファイル（拡張子txtまたはzip)
　（複数可）をドラッグ＆ドロップします。(「ファイル選択」から開くでも同じ)
　テキストファイルと同じ場所に「元ファイル名.epub」または「[著作者名] 表題.epub」のファイルが生成されます。
　※テキストのない画像のみのzipを変換した場合は、画像のみのePubファイルを生成します。

#### Web小説の変換
　Web小説サイトの作品一覧ページのURLまたはURLショートカット(.url)のドラッグ＆ドロップでの取得と変換も可能です。
　（web/ 以下に定義ファイルがあるサイトのみ）
 - 「小説家になろう/小説を読もう！」(＋関連サイト)「NEWVEL-LIBRARY」「FC2小説」「HAMELN」「Arcadia」「novelist.jp」「dNoVeLs」「暁」「カクヨム」「ノベルアップ＋」から取得が可能です。

#### Wikiページ
　Wikiで簡単な使い方を公開しています。
https://github.com/kyukyunyorituryo/AozoraEpub3/wiki/


画面設定
------------
#### 表題
* 本文内
  本文内のタイトルと著者名の有無を設定します。
  3行連続の場合はタイトルの次は副題してタイトルと連結します。
  本文中のタイトルは大きい文字で、著者名地付きに設定されます。
  画像や空行は無視されます。
  「先頭が発行者」を選択すると1行目を発行者として扱います
* ファイル名優先
  "[著作者名] 表題.epub" のファイル名からタイトルと著者名を取得します。
  本文中のタイトル行と著者名の行のスタイル設定は本文内の選択に従います。

#### 表紙
* 表紙
  表紙の画像を[先頭の挿絵][入力ファイル名と同じ画像(png,jpg)][表紙無し]またはファイル、URLを指定します。
  [入力ファイル名と同じ画像(png,jpg)]は、入力ファイル名と拡張子以外が同じ画像を表紙に利用します。
  (拡張子は以下の順でチェックpng,jpg,jpeg,gif)
  表紙画像が無い場合にテキストファイルのパスに cover.png|jpg|jpeg のファイルがあれば確認画面で表紙に設定します。

#### ページ出力
* 表紙
  ePubの先頭に表紙ページ（画像は幅100％）を追加します。
  Reader等で表紙を出したい場合に指定してください。
  （文中の挿絵を表紙に指定した場合は先頭に移動されます）
* 表題
  表題 表題、著者等のページを左右中央または横書きの単一ページで出力します。
* 目次
  目次ページを出力する場合に選択します。
  縦書きと横書きが選べます

* 拡張子
  出力ファイルの拡張子を指定します。
  Koboでの利用は「.kepub.epub」を選択
  「.fxl.kepub.epub」はKobo固定レイアウト用の拡張子です
  「.mobi」を選択でepub変換後にKindlegen.exeでmobiへの変換を行います
  「.mobi+.epub」を選択で変換前のepubファイルも同時に出力します
* 出力ファイル名に表題利用
  "[著作者名] 表題.epub" のファイル名で出力します。
  どちらも設定されていない場合は「元ファイル名.epub」で出力します。
* ePubファイル上書き
  同名のファイル(元ファイル名.epub)がすでにある場合でも上書きして出力します。
  チェックを外すと同じファイルがある場合は変換しません。

#### 出力先
* 出力先
  「入力と同じ」を選択すると入力ファイルのパスに出力します。
  「パス指定」で出力先を指定する場合にフルパスを設定します。

#### 変換設定
* 栞用ID出力
  Koboのkepubでの栞用のid(kobo.1.1形式)を行のpタグに設定します。
  Koboのkepub以外の環境では不要です。
* 4バイト文字変換
  チェックを外すと4バイト文字を〓に変換し、後ろに注記を小書きで表示します。
  （Koboでは行内の4バイトの文字以降が表示されない問題があります）
  Readerでは4バイトのJIS漢字が表示されます。
  （ただし表示できない漢字は□で表示され、小書きの注記も表示されません）
* 縦書き 横書き
  本文の縦書きと横書きを指定します。

#### 変換
* 入力文字コード
  入力する青空文庫ファイルの文字コードを指定します。通常はMS932(SJIS)です。
* ファイル選択
  ファイルを選択するとテキストエリアにドラッグアンドドロップするのと同様に変換されます
* 変換前確認
  変換前に、タイトルと著者名と表紙の確認と編集が可能なダイアログを表示します。
  修正したタイトルと著者名でメタデータが作成されます。
  本文側のタイトルやスタイルは変更されません。
  表紙はトリミングした画像を出力し、元画像を残す指定も可能です。

----
#### 画像設定1
* 挿絵除外
  テキスト内の挿絵画像を表示せずePubファイルにも格納しません。 表紙と外字画像は出力されます。
* 画面サイズ
  画面の縦横比と、小さい画像を拡大しない場合の判別に利用します
* 表紙サイズ
  表紙画像はこのサイズ以下になるように縮小します
* 画像倍率
  画像の表示倍率を、画像ピクセル数と画面解像度に応じた比率で幅を％指定しします。
  ※画面回転で縦横比が変わった場合は下にはみ出す可能性があります。
* 画像回り込み
  本文中の画像の上下に文字を回り込むように画像を配置します。
  指定した画像サイズ以下の画像のみ回り込み表示されます
* 画像単ページ化
  文中の画像の前後に改ページを入れて単ページ化する対象の画像サイズを設定します
  画像のみが表示されるページとして出力します
* 縮小表示
  画面サイズより小さい画像は画面の縦か幅に合わせて拡大表示されます
#### 画像設定2
* 縮小時のJpeg画質
  縮小処理を行うときのJepgの圧縮パラメータです 100が最高画質です
* 画像縮小回転
  縦横のピクセル数以下になるように画像を縮小します (縮小アルゴリズムはBicubic)
  端末のサイズ制限がある場合に設定してください
  画像と画面の縦横比に合わせて回転する設定も可能です
* 余白除去
  画像の上下左右の余白を除去します。
  画像のみのzip/rarファイルのみで利用可能です
  pngは入出力に時間がかかるのと圧縮率の関係で若干サイズが大きくなります。
  (推奨設定 横:15% 縦:10～20% 白レベル:85~90% 余白追加: 0.5%～1.0%)

----
#### 詳細設定
* 文中全角スペースの処理
  ？の後などに全角スペースがある場合に2行目以降で行頭に来て段落のように見えてしまうためスペースを非表示にします
* 空行除去
  1行以上の連続した空行単位で指定した行数の空行を減らします。
  見出し行の後ろ3行から始まる空行は最低１行残します。
  最大を指定するとこれ以下の空行になるように除去します。
* 行頭字下げ
  行頭が「『―”（〈〔【と全角空白以外なら行頭に全角空白を追加します 半角空白のみは全角に置き換えます。
* 自動縦中横
  2文字の半角の数字と２～３文字の!と?を縦に並べて表示します。
　数字1桁3桁、!?の1文字は、設定で縦中横にするか変更できます。
　前後に全角の文字が無い場合(間の半角スペースは無視)や、横組み注記の中では無効になります。
* コメント出力
  50文字以上の - の行で挟まれたコメントブロックの表示方法を指定します。
* 強制改ページ
  有効にすると、指定バイト数で強制改ページを行います。
  ePub内の各xhtmlファイルのサイズや行数が増えることで、Reader等で処理が重くなるのを防ぎます。
  字下げ等のブロック注記等の中にある場合は改ページされません。
  各行: 指定バイト数を超えた行で強制改ページします。
  空行: 空行が指定行数続いたとき指定バイト数を超えていたら強制改ページします。
  見出し前: 目次の見出しに該当する行の前で指定バイト数を超えていたら強制改ページします。

----
#### 目次設定
* 目次出力
  最大文字数: 目次の名称の最大文字数を設定します。長い文字が省略された場合は ... がつきます。
  表紙: 表紙ページへの目次を出力します。 表紙画像が無い場合は出力されません。
  次の行を繋げる: 章タイトルが次の行にある場合等で、見出しの次の行の文字を目次の名称に繋げます。
  連続する見出しを除外: 目次ページ等で自動抽出された見出しを目次に入れません。
* 目次抽出
　改ページ後: 改ページ後に最初の文字の行を目次に追加します。
  注記: 選択した見出し注記内の文字を目次に追加します。ブロック注記の場合は次の行(繋げた場合の2行)のみ
  章見出し: 章の名前(数字含む)を自動で抽出して目次に追加します。
    （第～話/第～章/第～篇/第～部/第～節/第～幕/その～/～章/プロローグ/エピローグ/モノローグ/序/序章/終章/間章/転章/幕間）
  数字のみ: 数字のみの行を目次に追加します。
  数字+見出し: 数字+空白等+見出し文字 の行を目次に追加します。
  数字(括弧内): 括弧内の数字のみの行を目次に追加します。（）〔〕【】
  数字(括弧内)+見出し: （数字）+空白等+見出し文字 の行を目次に追加します。
  その他パターン: 目次抽出パターンを正規表現で指定します。前後の空白と注記タグを除いた文字列と比較します。

#### スタイル設定
* 行の高さ
  １行の高さを文字数で指定します。 1.8の場合行間が0.8文字分空きます。
* 文字サイズ
  標準の文字サイズを調整するための倍率を指定します。
* テキスト余白 (@page margin)
  ページの上下左右の余白を指定します。
* テキスト余白 (html margin)
  ページの上下左右の余白を指定します。
  Readerでは@pageの指定が効かないためこちらを利用します。

* 濁点/半濁点文字
  そのままの出力か、position指定で重ねるかを選択できます。
  ルビ内では無効です。
  Reader, Kobo, Kindle 以外は動作未確認です。

使い方 CUI
------------
#### コマンドラインからの実行
　Usage: java -cp AozoraEpub3.jar AozoraEpub3 \[-options] input_files(txt,zip)

**オプション**
- -h,--help
　　show usage
- -i,--ini <arg>
　　指定したiniファイルから設定を読み込みます (コマンドラインオプション以外)
　　(指定がない場合はAozoraEpub3.ini ファイルがなければデフォルト値)

- -enc <arg>
　　入力ファイルエンコード  \[MS932](default) [UTF-8]
- -t <arg>
　　本文内の表題種別  \[0:表題→著者名](default)[1:著者名→表題][2:表題→著者名(副題優先)][3:表題のみ][4:なし]
-  -c,--cover <arg>
　　表紙画像  \[0:先頭の挿絵][1:ファイル名と同じ画像][ファイル名 or URL]
- -tf
　　入力ファイル名を表題に利用

- -d,--dst <arg>
　　出力先パス
- -ext <arg>
　　出力ファイル拡張子  \[.epub](default) [.kepub.epub]
- -of <arg>
　　出力ファイル名を入力ファイル名に合せる

ファイルの説明
------------
#### プログラムファイル
* AozoraEpub3.jar
    ePub3変換ツール
    ダブルクリックまたは"java -jar AozoraEpub3.jar"で実行
* AozoraEpub3.ico
    ショートカットを作成時にこのアイコンを指定してください（jarなので設定できない）
* 利用ライブラリ
    利用ライブラリ (commons-cli, commons-compress, Velocity, JAI) は build.gradle ファイルにて指定

#### ePub3テンプレート
* template/*
    ePub3テンプレート
* template/item/style/*.css
    ePub3スタイル

#### 変換用設定ファイル
* chuki_tag_suf.txt
    前方参照型注記を開始終了型注記に変換
* chuki_tag.txt
    注記をePubタグに変換
* chuki_alt.txt
    外字注記を代替文字に変換
* chuki_utf.txt
    外字注記(コード無し)をUTF-8文字に変換
* chuki_ivs.txt
    外字注記(コード無し)をIVS付きのUTF-8文字に変換
* chuki_latin.txt
    ラテン文字注記をUTF-8に変換
* replace.txt
    文字置換設定ファイル

#### Web小説設定ファイル
* web/ドメイン名/extract.txt
    Wev小説抽出定義ファイル

#### 外字フォントファイル
* gaiji/*
    １文字フォントファイルを置くことで外字を対応フォントで表示します。

対応している注記
------------
#### 基本的な注記に設定ファイルで対応
 chuki_tag.txt 参照

*機種別の対応状況
  横組み注記はKindleでは非対応

#### 例外的にプログラム処理しているもの
- ページの左右中央
- ［＃注記付き］○［＃「△」の注記付き終わり］と［＃「○」に「△」のルビ］ → ｜○《△》に変換
- ［＃「○」に×傍点］ → 文字と同数の×ルビに変換
- 字下げ連続時の［＃ここで字下げ終わり］の省略
- 字下げ折り返しと字下げ字詰めは数値化してインデント計算
  ［＃ここから○字下げ、折り返して●字下げ］［＃ここから○字下げ、●字詰め］
- 字下げ複合はclassを合成 (罫囲み、中央揃え)
- 画像
    ［＃説明（ファイル名.拡張子）］
    &lt;img src="ファイル名"/&gt;
- 横組み・縦中横内の自動縦中横の抑止
- 割り注の改行追加
- 底本： で改ページ (直前に改ページがない場合)

対応している外字と特殊文字
------------
* 外字注記をコード変換してUTF-8文字で出力 （UTF8コード、JISコードあり）
- 青空文庫外字注記
 ※［＃「さんずい＋垂」、unicode6DB6］
 ※［＃「さんずい＋垂」、U+6DB6、235-7］
 ※［＃「さんずい＋垂」、UCS6DB6、235-7］
 ※［＃「てへん＋劣」、第3水準1-84-77］
  コードのみの外字注記
 ※［＃U+845b］
-※［＃u+845b-e0100］
 ※［＃U+845b-U+e0100］
- コード記述がない外字注記
  注記の名称から対応表にあるUTF-8に変換 (chuk_utf.txt, chuki_ivs.txt)
  IVS文字は出力設定が可能

* UTF-8にない外字注記は代替文字を出力 (chuk_alt.txt)

* 青空文庫特殊文字（《》［］〔〕｜＃※）
 ※［＃始め二重山括弧、1-1-52］ →《
 ※［＃終わり二重山括弧、1-1-53］ →》
 ※［＃始め角括弧、1-1-46］ →［
 ※［＃終わり角括弧、1-1-47］ →］
 ※［＃始めきっこう（亀甲）括弧、1-1-44］ →〔
 ※［＃終わりきっこう（亀甲）括弧、1-1-45］ →〕
 ※［＃縦線、1-1-35］ →｜
 ※［＃井げた、1-1-84］ →＃
 ※［＃米印、1-2-8］ →※

* くの字点「／＼」「／″＼」をUTF-8で出力

独自対応注記
------------
- ここから○字上げ
- 区切り線
- 空行
- 中央揃え
- 中央寄せ
- 取消線
- 二重取消線 → 取消線と同じ
- ページ左
- ページ左寄せ
- ページ左下
- ページの左下
- 正立
- 文字色　黒色　黒色終わり　ここから黒色　ここで黒色終わり
- 色背景　黒背景　黒背景終わり　ここから黒背景　ここで黒背景終わり

未対応注記
------------
- 訂正と「ママ」 → 無視
- 左ルビ
- 行内の地付き → 次の行の地付きになる
- ２段組

更新予定と更新履歴
------------
README_Changes.txt 参照


ライセンス
------------
- ソースコードおよびバイナリ
GPL v3 ( http://www.gnu.org/licenses/gpl-3.0.html )
※ソースコードの流用、改変、再配布を行った場合もGPL v3が適用されます。

- 作成したデータ
AozoraEpub3で変換したePubファイルの著作権は入力データと同一になります。
ePubファイルの修正や配布は入力データの著作権内で自由に行うことができます。

License
------------
- SourceCode and Binary
GPL v3 ( http://www.gnu.org/licenses/gpl-3.0.html )

- Converted Data
Copyright of converted ePub file will be the same as the input data.
modification and distribution of ePub files can be freely carried out in a copyright.
