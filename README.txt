Mateescu Razvan 322CC

grad de dificultate :mediu

total de lucru cumulat: 30 ore


In clasa Produs am folosit un constructor pentru a afisa elementele produsului denumire,categorie,tara,pret,
unde am implementat metodele cerute.
La fel in clasa ProdusComandat am folosit un constructor ce primeste ca argumente 
un obiect de tip produs si taxa si cantitatea.

In clasa Factura creez obiectele de tip Factura. Ma folosesc vectorul de produse comandate primit ca argument de constructor.
Pentru fiecare produs comandat obtin cantitatea si taxa pt metodele care cer taxa pt fiecare produs si produsul .Din fiecare produs obtin pretul.
Totalul unei facturi se calculeaza prin adunarea totalurilor fiecarui produs inmultit cu cantitatea.
Pentru metodele cu taxa se inmulteste cu procentajul respectivei taxe
De asemenea pt totalurile pentru o anumita tara se cauta produsele din tara primita ca argument
De asemena am implementat si o metoda pentru calculul totalurilor dintr o factura pentru o anumita tara folosita pentru clasa MediumMarket

In clasa Magazin implementez metodele interfetei Imagazin,folosind un constructor ce primeste ca argument numele magazinului si
un vector de facturi.Adun astfel toate facturile pt fiecare metoda continute de un anumit magazin.
De asemenea implementez si 2 metode care calculeaza totalul cu scutiri cu scutirea in functie de tipul magazinului.

In clasele MiniMarket MediumMarket HyperMarket am calculat metodele de calculscutri taxe.
La constructorul MiniMarket am mostenit numele si vectorul de facturi de la Magazin si am trimis ca parametru
un vector de tari astfel am calculat daca totalul unei tari depaseste procentajul scris in enunt.
Am procedat la fel pentru clasa MediumMarket doar ca folosind un vector de categorii iar la HyperMarket totalul
fiecarei facturi.
De asemenea obiectele de tip magazin le am creat folosind Factory pattern. In clasa Magazinfactory am implementat Factory patern
Astfel este creat obiectul magazin in functie de tipul magazinului citit.De asemenea am implementat si 2 clase comparatori
pentru a putea ordona crescator la afisare magazinele si facturile.

In clasa Gestiune am retinut produsele si magazinele sub forma de liste si taxele ca dictionare de perechi.
In aceasta clasa am facut toate citirile.
In functia dictionar retin tarile intr-un vector si pentru fiecare tara calculez dictionarul cu catgoriile si perechile
respectivei categorii parcurcand astfel pe coloane fisierul de taxe.De asemenea trimit fisierele ca parametru
in stringuri functiei pentru a putea fi incarcate in functia de la taskul 2 .
In functia produse parcurg fisierul de produse de unde obtin denumirea,categoria,pretul si tara pentru fiecare produs
si le retin intr o lista.
In functia factura parcurg fisierul de facturi si afisez facturile pentru obiectul gestiune de la taskul 2.
In functia factmag retin produsele si categoriile in vectori. Apoi parcurg fisierul de facturi linie cu linie
Daca linia curenta contine cuvantul magazin folosesc un delimitator si retin tipul magazinului.
Sar peste liniile goale.Folosesc un vector de facturi si un vector de produse comandate.
Cand dau peste numele unei facturi retin numele.Apoi citesc produsele si creez produsele comandate retinandu-le
intr un vector.Dupa ce citesc toate produsele comandate pt o factura creez obiectul factura si il retin intr un vector.
Dupa aceea creez magazinul in functie de tipul acestuia cu facturile respective din vector.
Ordonez crescator magazinele in functie de total pt fiecare tip retinad rezultatul intr o lsta de magazine
Apoi afisez totalurile din fiecare magazin conform cerintei totodata ordonand cu un comparator crescator facturile pt fiecare magazin.
Pentru afisarea exacta a rezultatelor am folosit DecimalFormat.
Implementez in clasa Singleton patern pe care il folosesc la afsiare.

In clasa Fereastra folosesc metodele din Java Swing pentru a crea o interfata grafica.Folosesc un constructor
unde dau numele interfetei la afisare. Creez 5 butoane 1 pt inchiderea aplicatiei 3 pt cele 3 fisiere si 1 pt Gestiune
Apoi pentru fiecare buton in metoda actionPerformed setez actiunea pe care sa o faca. Folosesc JFileChooser pentru a selecta fisierele
Pt functia butonuului  gestiune incarc cele 3 fisiere apeland metodele respective din clasa Gestiune.
Setez culorile interfetei si butoanelor.Totodata setez sa se schimbe culoarea fiecarui buton daca actiunea intreprinsa e reusita. 

 