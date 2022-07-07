## დავალება 06.07.2022

1. აიღეთ წინა დავალებებში არსებული Figure, Rectangle, Circle და Triangle  კლასები. ფიგურების შედარება იყოს getLength მეთოდით. თუ ორივე ფიგურის  სიგრძე (პერიმეტრი) ტოლია, მაშინ ფიგურებიც ითვლებოდეს ტოლად, ხოლო მეტი  getLength რომელსაც აქვს, ის მეტად და ანალოგიურად ნაკლები - ნაკლებად.

2.  შექმენით სამი Input ფაილი: Circles_in.dat, Rectangles_in.dat,  Triangles_in.dat. ამ ფაილების სახელები პროგრამას გადაეცემოდეს args  მასივის საშუალებით.
Circles_in.dat ფაილში ჩაწერილი იყოს წრეწირის რადიუსები, თითო ხაზზე თითო რადიუსი.
Rectangles_in.dat ფაილში ჩაწერილი იყოს მართკუთხედები, თითო ხაზზე თითო მართკუთხედი. ფორმატი: a-b ანუ სიგრძე, ტირე და სიგანე.
Triangles_in.dat  ფაილში ჩაწერილი იყოს სამკუთხედები, თითო ხაზზე თითო სამკუთხედი. ფორმატი  a-b-c ანუ პირველი გვერდის სიგრძე, ტირე, მეორე გვერდის სიგრძე, ტირე და  მესამე გვერდის სიგრძე.

3. დაწერეთ მეთოდი readCircles, რომელიც  ფაილიდან წაიკითხავს Circle-ებს (თუ რომელიმე ხაზზე არავალიდური  მნიშვნელობა დახვდა ამოსაკითხად და Circle შესაქმნელად, ის ხაზი  გამოტოვოს), შეინახავს მათ Circle-ების ArrayList-ში და დაასორტირებს  ზრდადობით. შემდეგ უკვე დასორტირებულ სიას ანალოგიური წესით (როგორც  Circles_in.dat ფაილიში იყო) ჩაწერს Circles_out.dat ფაილში.

4. დაწერეთ  მეთოდი readCirclesUnique, რომელიც ფაილიდან წაიკითხავს Circle-ებს (თუ  რომელიმე ხაზზე არავალიდური მნიშვნელობა დახვდა ამოსაკითხად და Circle  შესაქმნელად, ის ხაზი გამოტოვოს), შეინახავს უნიკალურ Circle-ების  HashSet-ში და შემდეგ ამ უნიკალურ სიმრავლეს ანალოგიური წესით (როგორც  Circles_in.dat ფაილიში იყო) ჩაწერს Circles_out_unique.dat ფაილში.

5.  დაწერეთ მეთოდი readRectangles, რომელიც ფაილიდან წაიკითხავს Rectangle-ებს  (თუ რომელიმე ხაზზე არავალიდური მნიშვნელობა დახვდა ამოსაკითხად და  Rectangle შესაქმნელად, ის ხაზი გამოტოვოს), შეინახავს მათ Rectangle-ების  TreeSet-ში, სადაც ისინი შენახული უნდა იყოს ზრდადობით. შემდეგ უკვე ამ  დასორტირებულ სიას ანალოგიური წესით (როგორც Rectangles_in.dat ფაილიში  იყო) ჩაწერს Rectangles_out.dat ფაილში.

6. დაწერეთ მეთოდი  readTriangles, რომელიც ფაილიდან წაიკითხავს Triangle-ებს (თუ რომელიმე  ხაზზე არავალიდური მნიშვნელობა დახვდა ამოსაკითხად და Triangle  შესაქმნელად, ის ხაზი გამოტოვოს), შეინახავს მათ Triangle-ების TreeSet-ში,  სადაც ისინი შენახული უნდა იყოს კლებადობით. შემდეგ უკვე ამ დასორტირებულ  სიას ანალოგიური წესით (როგორც Triangles_in.dat ფაილიში იყო) ჩაწერს  Triangles_out.dat ფაილში.