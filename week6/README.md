
#### 1 -) CoroutineScope dışında bir sonsuz döngü içinede sayaç yaptım.
#### 2 -) Döngü kitlenmeden sonsuza doğru sayacımızı artırmaya devam etti.
#### 3 -) Hayır kitlenmeye sebep olur ve çalışmaz döngümüz sınırlı bir döngü olsaydı döngü sonunda çalışacaktı.

## Buradan ne çıkardım ? <br>

Program sırasıyla kodumuz çalışıyor,CoroutineScope çalışıyor IO'da network operasyonunu yaptı,
suspend function olduğu için askıya alındı. Sonra diğer satırları okuyor, Main thread üzerinde 
bir log işlemi var bu işlemde network(IO) işlemi bekleyeceği için bunuda bekletiyor. Sonra 
CoroutineScope'u kapatıyor fakat background da çalışıyor,sonra döngümüz başlıyor döngümüz 
başlayınca Main thread kitleniyor ama IO thread kitlenmez IO threadteki network cevabımız
2 saniye sonra gelir ama cevap geldiğinde CoroutineScope(Dispatchers.Main) içerisindeki 
kod çalışmaz Çünkü main threadimiz döngü tarafından kitleniyor..


### Sonsuz Döngü
<img src="https://user-images.githubusercontent.com/99819569/193056326-5360b129-d5d1-4257-abee-4416d198c50f.png" width="50%" height="50%"/>

### Sınırlı Döngü

<img src="https://user-images.githubusercontent.com/99819569/193056530-d08515d2-c36c-4e4f-9a37-8749e3af035b.png" width="50%" height="50%"/>

### Sınırlı Döngü sonrası Coroutine Çıktısı

<img src="https://user-images.githubusercontent.com/99819569/193056872-604b1970-352e-485a-baee-c9561e1ce3c8.png" width="50%" height="50%"/>
