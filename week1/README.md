XML (genişletilebilir İşaretleme Dili), HTML'ye çok benzeyen, kendi kendini tanımlayan ve bilgileri depolamak ve taşımak için tasarlanmış,
yazılım ve donanımdan bağımsız bir araçtır. XML'in temel özelliklerinden biri, öğe adlarının geliştirici tarafından atanması ve bunun,
tek bir uygulama tarafından birden çok XML belgesi kullanıldığında çakışmalara neden olma eğiliminde olmasıdır.

Aşağıdaki kod bloğunun tümü, bir uygulama içindeki öğelere benzersiz değerler atamak,
Android stüdyosunun derleme zamanında hataları işlemesini kolaylaştırır ve sonuçta
Android ad alanını tanımlayarak karmaşık uygulamaları daha yönetilebilir hale getirir.
 Çatışmaları en aza indirmek için google tarafından bir tasarım seçimi.
 ```
xmlns:android="http://schemas.android.com/apk/res/android"

xmlns:app="http://schemas.android.com/apk/res-auto"

xmlns:tools="http://schemas.android.com/tools"
 ```