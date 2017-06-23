# Interview Challenge
This is a test project for technical recruiting process.

I used as user interface technology Java Server Face (JSF) , as for object -to- storage mapping I used Java Persistence API (JPA), finally JDBC as database. 

In doubt of technical issues you can send a mail with your questions.

## Preconditions

### Technical
You need:

* Netbeans IDE 8.2 or higher

### Launch project .
* It can be executed by a server machine that runs a web server supporting the Java EE specifications Java Servlets, Java Expression Language (EL), JPA and JSF.    ((simply import it to Netbeans , Run GlassFish server, deploy the project and run ))).

### Components included and fictionality 
*  Front-end consists of a web browser's rendering of HTML-forms-based UI pages.
*  Back-end consists of components, including data validation and UI page creation.
*  The operations included (Create/View/Update/Delete).

1- Create a new sample by allowing the user to enter the data of a sample.
2- View sample from the data store and show them in the table.
3- Update the sample position only ( row , Column).
4- Delete a sample.



### For the graph and algorithm . 
*  First step Divide the well plate into 3 groups. (First – second –third) each one of them is associated with a specific portion of well plate.Group A = ( A-B-C ) – from 1 to 12  meaning A1……A12 , B1…….B12 , C1…..C12Group B = ( D-E-F ) – from 1 to 12  meaning  D1….D12 , E1 …..E12, F1…..F12 Group C = ( G-H ) – from 1 to 12 meaning  G1……G12 , H1…….H12  *  Here:a java class.you we can set its name as  (sampleModel)public  sampleModel{//the atributs  sample_id ,plate_id,row,coulnm,volunm///now we need to set its getter setter //like thispublic int getrow {    return getrow;}public void getrow (int rows) {    this. row = row;}}//now we need to write function where we want to fatch all data     public List< sampleModel > Get_Sample() {        List< sampleModel > SampleArry = null;        long result;        SQLiteDatabase db = getReadableDatabase();        //   Toast.makeText(get, "Your BMI is " + result,  Toast.LENGTH_SHORT).show();        //String query = "SELECT *  FROM  " + TABLE_FAV + " ORDER BY loc_name";        String query = "SELECT *  FROM sample ";        Cursor cursor = db.rawQuery(query, null);        ///////////////////////////        cursor.getColumnNames();        if (cursor.moveToNext()) {           SampleArry = new ArrayList<>();            do {///ok here 2////////////////we need to set model atributs sampleModel data=new sampleModel ();                data.setsample_id(cursor.getString(cursor.getColumnIndex("sample_id")));                data.setrow(cursor.getString(cursor.getColumnIndex("row")));                data.setColunm (cursor.int(cursor.getColumnIndex("coulunm")));               SampleArrey.add(data); //every object added in Arrrylist            } while (cursor.moveToNext());        } else {            return null;        }        //  Log.e("arry", String.valueOf(time_table.length));        cursor.close();        db.close();        // closeDatabase();        return SampleArrey;    }//now we have every row in objects// setting the data on graph //we need to create table with limited number of row and column [8]X[12]ListArrey<sample>  getdate=classobj.getsamplelist();for (int i=0 ,i<=gatdata.size,i++){<tr>detdata.get(i).getrow()<tr>}*  Step two:Place the sample on the graph .If ( group == ‘A’ ){ The search or the placement will be within a small portion . A1 …………………A7…………………A12 B1 …………………B7…………………B12 C1 …………………C7…………………C12 The advantage here to eliminate the error of placing it with wrong place and retrieve it within a second .*  Note : We will convert the row letters to number so it will be easier to handle it (X,Y) . If char A ==1 , B==2 …….so on