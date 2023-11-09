# SE-Lab-2
## گام اول
<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>Order Service</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phone Order Payment</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>Order Service</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفتی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phone Order Payment</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>3</strong></p>
</td>
<td width="198">
<p>PaymentService</p>
</td>
<td width="141">
<p>اضافه کردن کلاس phoneOrderService</p>
</td>
<td width="292">
<p>اضافه کردن کلاس فوق برای پشتیبانی از سرویس پرداخت تلفنی و پیاده سازی واسطOrderService</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>4</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>پیاده سازی تابع پرداخت تلفنی</p>
</td>
<td width="292">
<p>پیاده سازی تابع phoneOrderPayment</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>5</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>پیاده سازی تابع ثبت تلفنی</p>
</td>
<td width="292">
<p>پیاده سازی تابع phonePaymentRegister</p>
</td>
</tr>
<td width="64">
<p><strong>6</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>امکان ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن حالت سوم به جملات شرطی برای پشتیبانی از ثبت پرداخت تلفنی</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>7</strong></p>
</td>
<td width="198">
<p>Main</p></p>
</td>
<td width="141">
<p>امکان پرداخت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن حالت سوم به جملات شرطی برای پشتیبانی از ثبت پرداخت تلفنی</p>
</td>
</tr>
<tr>
</tbody>
</table>

مجموع تعداد تغییرات: 7

## گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID
در خصوص این برنامه‌ای که نوشته شده بود و شما یک قابلیت به آن اضافه کردید، بر اساس اصول SOLID موارد نقض و یا محقق شدن هر کدام از آن اصول را بیان کنید. در بیان موارد تحقق و نقض، علت تحقق و یا نقض را نیز به صورت کامل توضیح دهید:

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td> 
<td width="454">
<p>کلاس های غذا و اردر محقق شدن چون هر کدام یک مسئولیت دارن</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کلاس اصلی نقض شده چون چند تا کار و تابع را انجام میدهد</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>تمامی قسمت ها رعایت شده اند</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>نمی توان روش های پرداخت رو جایگزین هم کرد</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کلاس انتزاعی درقسمت اردر سرویس ها بعضی ها رعایت شده</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کلاس انتزاعی در اردر سرویس برای خیلی هش نقض شده</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>هر سه کلاس یک شیوه را برای کلاس انتزاعی پیاده سازی میکنن</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

در خصوص هرکدام از موارد نقض هرکدام از اصول، یک راهکار را به منظور رفع آن مشکل ارایه داده و در جدول زیر ثبت نمایید:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>LSP</p>
</td>
<td width="246">
<p>انتزاعی نبودن اردر سرویس</p>
</td>
<td width="284">
<p>انتزاعی کردن اردرسرویس</p>
</td>
</tr>
<tr>
<td width="168">
<p>SR</p>
</td>
<td width="246">
<p>مورد اول</p>
</td>
<td width="284">
<p>تابع کردن کلاس اصلی</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>
