# Лабораторная работа №3

### Создание тест-кейсов

------

<ins>**ТЕСТ-КЕЙС 1**</ins> Скупка ETH без всяких дополнительных параметров.

<ins>*Шаги:*</ins>

   - Зайти на сайт <https://www.okex.com/ru>.

   - Зайти под учетной записью тестового аккаунта (логин - outestingEPAM12345@gmail.com, пароль - testing12345EPAM).

   - Нажать на учетную запись и переключиться на "демо-счет".

   - Переходим в "Ручная торговля".

   - Перейти в окно "Купить".

   - Выставить цену (ВТС) на 5.

   - Выставить количество (ETH) на 2.

   - Ползунок стоит на 100%.

   - В итоге в поле итого (ВТС) автоматически укажется цена в 10.

   - Нажать на кнопку "Купить ETH".

<ins>*Ожидаемый результат:*</ins>
В окне "История ордеов" появится только что купленный демо-счет.




<ins>**ТЕСТ-КЕЙС 2.**</ins> Скупка ETH с движением ползункана 25%.

<ins>*Шаги:*</ins>

   - Зайти на сайт <https://www.okex.com/ru>.

   - Зайти под учетной записью тестового аккаунта (логин - outestingEPAM12345@gmail.com, пароль - testing12345EPAM).

   - Нажать на учетную запись и переключиться на "демо-счет".

   - Переходим в "Ручная торговля".

   - Перейти в окно "Купить".

   - Выставить цену (ВТС) на 5.

   - Передвигать ползунок на 25%.

   - Автоматически выводится количество (ETH) на 0.049315.

   - В итоге в поле итого (ВТС) автоматически укажется цена в 0.24657.

   - Нажать на кнопку "Купить ETH".

<ins>*Ожидаемый результат:*</ins>
В окне "История ордеов" появится еще только что купленный демо-счет. 



<ins>**ТЕСТ-КЕЙС 3.**</ins> Скупка ETH с тейк-профитом и движение ползунка на 50%.

<ins>*Шаги:*</ins>

   - Зайти на сайт <https://www.okex.com/ru>.

   - Зайти под учетной записью тестового аккаунта (логин - outestingEPAM12345@gmail.com, пароль - testing12345EPAM).

   - Нажать на учетную запись и переключиться на "демо-счет".

   - Переходим в "Ручная торговля".

   - Перейти в окно "Купить".

   - Выставить цену (ВТС) на 0,06855.

   - Передвигать ползунок на 50%.

   - Автоматически выводится количество (ETH) на 3.584892.

   - В итоге в поле итого (ВТС) автоматически укажется цена в 0.24574.

   - Выбрать в поле "Тейк-профит".

   - Выставить стоп-цену тейк-профита (ВТС) на 0,08.

   - Нажать на кнопку "Купить ETH".
   
<ins>*Ожидаемый результат:*</ins>
В окне "История ордеов" появится еще только что купленный демо-счет. Вы можете установить цену стоп-ордера заранее. После полного заполнения ордера система разместит стоп-ордер в соответствии с заранее определённой ценой и количеством. Тейк-профит ордер сработает, когда рыночная цена достигнет 0.08000 BTC, ожидается прибыль в размере 0.041047 BTC. Здесь стоп-цена тейк-профита должна быть больше, чем цена начальная.


<ins>**ТЕСТ-КЕЙС 4.**</ins> Скупка ETH со стоп-лоссом и движение ползунка на 100%.

<ins>*Шаги:*</ins>

   - Зайти на сайт <https://www.okex.com/ru>.

   - Зайти под учетной записью тестового аккаунта (логин - outestingEPAM12345@gmail.com, пароль - testing12345EPAM).

   - Нажать на учетную запись и переключиться на "демо-счет".

   - Переходим в "Ручная торговля".

   - Перейти в окно "Купить".

   - Выставить цену (ВТС) на 0,06855.

   - Передвигать ползунок на 100%.

   - Автоматически выводится количество (ETH) на 7.169784.

   - В итоге в поле итого (ВТС) автоматически укажется цена в 0.49148.

   - Выбрать в поле "стоп-лосс".

   - Выставить триггер-цену стоп-лосса (ВТС) на 0,05.

   - Нажать на кнопку "Купить ETH".
  
<ins>*Ожидаемый результат:*</ins>
В окне "История ордеов" появится еще только что купленный демо-счет. Вы можете установить цену стоп-ордера заранее. После полного заполнения ордера система разместит стоп-ордер в соответствии с заранее определённой ценой и количеством. Стоп-лосс ордер сработает, когда рыночная цена достигнет 0.05000 BTC, ожидается убыток в размере 0.132999 BTC. Здесь триггер-цена стоп-лосса должна быть меньше начальной.


<ins>**ТЕСТ-КЕЙС 5.**</ins> Скупка ETH со стоп-лоссом и тейк-профитом и движение ползунка на 75%.

<ins>*Шаги:*</ins>

   - Зайти на сайт <https://www.okex.com/ru>.

   - Зайти под учетной записью тестового аккаунта (логин - outestingEPAM12345@gmail.com, пароль - testing12345EPAM).

   - Нажать на учетную запись и переключиться на "демо-счет".

   - Переходим в "Ручная торговля".

   - Перейти в окно "Купить".

   - Выставить цену (ВТС) на 0,06855.

   - Передвигать ползунок на 75%.

   - Автоматически выводится количество (ETH) на 0.004743.

   - В итоге в поле итого (ВТС) автоматически укажется цена в 0.00032.

   - Выбрать в поле "стоп-лосс" и "тейк-профит".

   - Выставить стоп-цену тейк-профита (ВТС) на 0,08.

   - Выставить триггер-цену стоп-лосса (ВТС) на 0,05.

   - Нажать на кнопку "Купить ETH".

<ins>*Ожидаемый результат:*</ins>
В окне "История ордеов" появится еще только что купленный демо-счет. Тейк-профит ордер сработает, когда рыночная цена достигнет 0.08000 BTC, ожидается прибыль в размере 0.000054 BTC. Стоп-лосс ордер сработает, когда рыночная цена достигнет 0.05000 BTC, ожидается убыток в размере 0.000087 BTC.



<ins>**ТЕСТ-КЕЙС 6.**</ins> Продажа ETH (демо-счета) и движением ползунка на 65%.

<ins>*Шаги:*</ins>

   - Зайти на сайт <https://www.okex.com/ru>.

   - Зайти под учетной записью тестового аккаунта (логин - outestingEPAM12345@gmail.com, пароль - testing12345EPAM).

   - Нажать на учетную запись и переключиться на "демо-счет".

   - Переходим в "Ручная торговля".

   - Перейти в окно "Продать". 

   - Выставить цену (ВТС) на 0.06567.

   - Передвигать ползунок на 65%.

   - Автоматически выводится количество (ETH) на 3.411893.

   - В итоге в поле итого (ВТС) автоматически укажется цена в 0.22405.

   - Нажать на кнопку "Купить ETH".

<ins>*Ожидаемый результат:*</ins> 
Ордер размещен. В окне "История ордеов" появится еще только что проданный демо-счет.


<ins>**ТЕСТ-КЕЙС 7.**</ins> Продажа ETH (демо-счета) с тейк-профитом.

<ins>*Шаги:*</ins>

   - Зайти на сайт <https://www.okex.com/ru>.

   - Зайти под учетной записью тестового аккаунта (логин - outestingEPAM12345@gmail.com, пароль - testing12345EPAM).

   - Нажать на учетную запись и переключиться на "демо-счет".

   - Переходим в "Ручная торговля".

   - Перейти в окно "Продать". 

   - Выставить цену (ВТС) на 0.00026.

   - Выставить количество (ETH) на 0.4.

   - В итоге указать цену в 0.00011.

   - Выбрать в поле "тейк-профит".

   - Выставить стоп-цену тейк-профита (ВТС) на 0.00002.

   - Нажать на кнопку "Купить ETH".

<ins>*Ожидаемый результат:*</ins>
В окне "История ордеов" появится еще только что проданный демо-счет. Вы можете установить цену стоп-ордера заранее. После полного заполнения ордера система разместит стоп-ордер в соответствии с заранее определённой ценой и количеством.  Здесь стоп-цена тейк-профита должна быть больше, чем цена начальная.



<ins>**ТЕСТ-КЕЙС 8.**</ins> Торги

<ins>*Шаги:*</ins>

   - Зайти на сайт <https://www.okex.com/ru>.

   - Зайти под учетной записью тестового аккаунта (логин - outestingEPAM12345@gmail.com, пароль - testing12345EPAM).

   - Нажать на учетную запись и переключиться на "демо-счет".

   - Переходим в маржинальную торговлю.

   - Выбираем тип маржи - изолированная. Кредитное плечо - 10.00Х.

   - Указываем цену в 34. А количество 77%.

   - Нажимаем "Обновить для торговли".

   - При нажатии нужно указать режим аккаунта нашего. 

<ins>*Ожидаемый результат:*</ins>
Так как мы находимся в простом режиме, то он создан только для спот-трейдеров. Доступно для торговли: Спот, опционы на покупку.
При нажатии активации другого аккаунта выдает ошибку: 
Your settings failed as you have positions, open orders or trading bots.



<ins>**ТЕСТ-КЕЙС 9.**</ins> Изменение языка.

<ins>*Шаги:*</ins>

   - Зайти на сайт <https://www.okex.com/ru>.

   - Зайти под учетной записью тестового аккаунта (логин - outestingEPAM12345@gmail.com, пароль - testing12345EPAM).

   - Нажать на учетную запись и переключиться на "демо-счет".

   - Нажать кнопку смены языка. Выбираем китайский. Выбираем валюту: юань.


<ins>*Ожидаемый результат:*</ins>
Язык интерфейса сменится на китайский. Местная валюта будет китайский юань.



<ins>**ТЕСТ-КЕЙС 10.**</ins> Проверка основных настроек графика.

<ins>*Шаги:*</ins>

   - Зайти на сайт <https://www.okex.com/ru>.

   - Зайти под учетной записью тестового аккаунта (логин - outestingEPAM12345@gmail.com, пароль - testing12345EPAM).

   - Нажать на учетную запись и переключиться на "демо-счет".

   - Нажать в поле графика значок настроек.
    
   - В списке инструментов выбрать «BOLL».

   - В списке инструментов выбрать «CandleStickHLC».

   - В списке шкалы выбрать «Метка названия индикатора».

   - Выбираем режим "На весь экран".

<ins>*Ожидаемый результат:*</ins>
Появление метки названия индикатора на графике. Изображение графика на весь экран. График отображен "свечами". Каждая свеча является 15-и минутным интервалом изменения цены.
