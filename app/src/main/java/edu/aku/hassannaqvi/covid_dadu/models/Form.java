package edu.aku.hassannaqvi.covid_dadu.models;

import android.database.Cursor;

import androidx.lifecycle.LiveData;

import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.covid_dadu.contracts.FormsContract.FormsTable;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class Form extends LiveData<Form> {

    private final String projectName = "covid_dadu";
    private String _ID = "";
    private String _UID = "";
    private String sysdate = "";
    private String a01 = ""; // Date
    private String a02 = ""; // Time
    private String a03 = ""; // Interviewer
    private String a04 = ""; // Province
    private String a05 = ""; // District
    private String refno = ""; // Reference Number
    private String istatus = ""; // Interview Status
    private String istatus96x = ""; // Interview Status
    private String endingdatetime = "";
    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsDT = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String devicetagID = "";
    private String synced = "";
    private String synced_date = "";
    private String appversion = "";
    private String sInfo = "";
    private String sB = "";
    private String sC = "";
    private String sD = "";
    private String sE = "";
    private String sF = "";
    private String sG = "";
    private String sH = "";
    private String sI = "";
    private String sJ = "";
    private String sK = "";
    private String sL = "";


    private String a05a = "";
    private String a05b = "";
    private String a06;
    private String a07;
    private String a08;
    private String a09;
    private String a10;
    private String a11;
    private String a12;
    private String a13dd;
    private String a13mm;
    private String a13yy;
    private String a14mm;
    private String a14yy;
    private String a15;
    private String a16;
    private String a17;
    private String a18;
    private String a19;
    private String a20;
    private String a21;
    private String a22pos;
    private String a22org;
    private String a23;
    private String b01;
    private String b02;
    private String b03;
    private String b04;
    private String b05;
    private String b06;
    private String b06ax;
    private String b07;
    private String b0801;
    private String b0802;
    private String b0803;
    private String b0804;
    private String b0805;
    private String b0806;
    private String b0807;
    private String b9;
    private String b10;
    private String b11;
    private String b11096;
    private String b11096x;
    private String b11mc;
    private String b11ws;
    private String b12;
    private String b1301;
    private String b1302;
    private String b1303;
    private String b1304;
    private String b1305;
    private String b1306;
    private String b1307;
    private String b1308;
    private String b1309;
    private String b13096;
    private String b14;
    private String b1501;
    private String b1502;
    private String b1503;
    private String b1504;
    private String b1505;
    private String b15096;
    private String b16;
    private String b17;
    private String c01;
    private String c0201;
    private String c0202;
    private String c03;
    private String c04;
    private String c05;
    private String c06;
    private String c07;
    private String c08;
    private String d1;
    private String d02;
    private String d03;
    private String d04;
    private String d05;
    private String e01;
    private String e02;
    private String e0201;
    private String e0202;
    private String e0301;
    private String e0302;
    private String e0303;
    private String e0304;
    private String e0305;
    private String e0306;
    private String e03096;
    private String e04;
    private String e05;
    private String e06;
    private String e07;
    private String e0801;
    private String e0802;
    private String e0803;
    private String e0804;
    private String e0805;
    private String e0806;
    private String e08096;
    private String e09;
    private String e10;
    private String e1101;
    private String e1102;
    private String e1103;
    private String e1104;
    private String e1105;
    private String e1106;
    private String e12;
    private String e13;
    private String e1401;
    private String e1402;
    private String e15;
    private String f01;
    private String f02;
    private String f03;
    private String f04;
    private String f05;
    private String f06;
    private String f07;
    private String f08;
    private String f09dd;
    private String f09mm;
    private String f09yy;
    private String f10;
    private String f11dd;
    private String f11mm;
    private String f11yy;
    private String f12;
    private String f13;
    private String f14;
    private String f15;
    private String f16;
    private String f17;
    private String g01;
    private String g02;
    private String g03;
    private String g04;
    private String g04096x;
    private String g0501;
    private String g0502;
    private String g0503;
    private String g0503a;
    private String g0504;
    private String g0505;
    private String g0506;
    private String g0506a;
    private String g0507;
    private String g0508;
    private String g0509;
    private String g0509a;
    private String g0510;
    private String g0511;
    private String g0512;
    private String g0513;
    private String g0514;
    private String g06;
    private String g0701;
    private String g0702;
    private String g0703;
    private String g0704;
    private String g0705;
    private String g0706;
    private String g0707;
    private String g0801;
    private String g0802;
    private String g0803;
    private String g0804;
    private String g0805;
    private String g0806;
    private String g0807;
    private String g0808;
    private String g0809;
    private String g08096;
    private String g09;
    private String g10;
    private String g11;
    private String g12;
    private String g12096x;
    private String g13;
    private String g13096x;
    private String h01a;
    private String h01dd;
    private String h01mm;
    private String h01yy;
    private String h02dd;
    private String h02mm;
    private String h02yy;
    private String h0301;
    private String h0302;
    private String h0303;
    private String h0304;
    private String h0305;
    private String h0306;
    private String h0307;
    private String h0308;
    private String h0309;
    private String h0310;
    private String h0311;
    private String h0312;
    private String h0313;
    private String h0314;
    private String h0315;
    private String h0316;
    private String h03096;
    private String h03096x;
    private String h04;
    private String h05;
    private String h06;
    private String h0701;
    private String h0702;
    private String h0801;
    private String h0802;
    private String h0803;
    private String h0804;
    private String h08096;
    private String h08096x;
    private String h09;
    private String h10;
    private String h11;
    private String h11096x;
    private String h12dd;
    private String h12mm;
    private String h12yy;
    private String h13;
    private String h13096x;
    private String h14;
    private String h14096x;
    private String h15;
    private String h16;
    private String h17;
    private String h1801;
    private String h1802;
    private String i01;
    private String i02;
    private String i03;
    private String i0401;
    private String i0402;
    private String i0403;
    private String i0404;
    private String i0405;
    private String i0406;
    private String i0407;
    private String i04096;
    private String i04096x;
    private String i05;
    private String i06;
    private String i07;
    private String j01;
    private String j02;
    private String j03;
    private String j04;
    private String j05;
    private String j06;
    private String j07;
    private String j0801;
    private String j0802;
    private String j0803;
    private String j0804;
    private String j0805;
    private String j0806;
    private String j08096;
    private String j08096x;
    private String j09;
    private String j09096x;
    private String j010;
    private String j011;
    private String j012;
    private String k01;
    private String k02;
    private String k03;
    private String k04;
    private String k05;
    private String k05096x;
    private String k06;
    private String k07;
    private String k08;
    private String k09;
    private String k10;
    private String k11;
    private String k12;
    private String k13;
    private String k14;
    private String k14096x;
    private String k15;
    private String k16;
    private String k16096x;
    private String k17;
    private String l01;
    private String l02;
    private String l02096x;
    private String l03;
    private String l04;
    private String l05;
    private String l06;
    private String l07;
    private String l08;
    private String l09;
    private String l010;
    private String gpslat;
    private String gpslng;
    private String gpsdate;
    private String gpsacc;
    private String deviceid;
    private String tagid;

    //For section selection
    private SectionSelection secSelection;


    public Form() {
    }

    public String getI0401() {
        return i0401;
    }

    public void setI0401(String i0401) {
        this.i0401 = i0401;
    }

    public String getI0402() {
        return i0402;
    }

    public void setI0402(String i0402) {
        this.i0402 = i0402;
    }

    public String getI0403() {
        return i0403;
    }

    public void setI0403(String i0403) {
        this.i0403 = i0403;
    }

    public String getI0404() {
        return i0404;
    }

    public void setI0404(String i0404) {
        this.i0404 = i0404;
    }

    public String getI0405() {
        return i0405;
    }

    public void setI0405(String i0405) {
        this.i0405 = i0405;
    }

    public String getI0406() {
        return i0406;
    }

    public void setI0406(String i0406) {
        this.i0406 = i0406;
    }

    public String getI0407() {
        return i0407;
    }

    public void setI0407(String i0407) {
        this.i0407 = i0407;
    }

    public String getI04096() {
        return i04096;
    }

    public void setI04096(String i04096) {
        this.i04096 = i04096;
    }

    public String getG0503a() {
        return g0503a;
    }

    public void setG0503a(String g0503a) {
        this.g0503a = g0503a;
    }

    public String getG0506a() {
        return g0506a;
    }

    public void setG0506a(String g0506a) {
        this.g0506a = g0506a;
    }

    public String getG0509a() {
        return g0509a;
    }

    public void setG0509a(String g0509a) {
        this.g0509a = g0509a;
    }

    public String getG0514() {
        return g0514;
    }

    public void setG0514(String g0514) {
        this.g0514 = g0514;
    }

    public SectionSelection getSecSelection() {
        return secSelection;
    }

    public void setSecSelection(SectionSelection secSelection) {
        this.secSelection = secSelection;
    }

    public String getsInfo() {
        return sInfo;
    }

    public void setsInfo(String sInfo) {
        this.sInfo = sInfo;
    }

    public String getSysdate() {
        return sysdate;
    }

    public void setSysdate(String sysdate) {
        this.sysdate = sysdate;
    }

    public String getA04() {
        return a04;
    }

    public void setA04(String a04) {
        this.a04 = a04;
    }

    public String getA06() {
        return a06;
    }

    public Form setA06(String a06) {
        this.a06 = a06;
        return this;
    }

    public String getA07() {
        return a07;
    }

    public Form setA07(String a07) {
        this.a07 = a07;
        return this;
    }

    public String getA08() {
        return a08;
    }

    public Form setA08(String a08) {
        this.a08 = a08;
        return this;
    }

    public String getA09() {
        return a09;
    }

    public Form setA09(String a09) {
        this.a09 = a09;
        return this;
    }

    public String getA10() {
        return a10;
    }

    public Form setA10(String a10) {
        this.a10 = a10;
        return this;
    }

    public String getA11() {
        return a11;
    }

    public Form setA11(String a11) {
        this.a11 = a11;
        return this;
    }

    public String getA12() {
        return a12;
    }

    public Form setA12(String a12) {
        this.a12 = a12;
        return this;
    }

    public String getA13dd() {
        return a13dd;
    }

    public Form setA13dd(String a13dd) {
        this.a13dd = a13dd;
        return this;
    }

    public String getA13mm() {
        return a13mm;
    }

    public Form setA13mm(String a13mm) {
        this.a13mm = a13mm;
        return this;
    }

    public String getA13yy() {
        return a13yy;
    }

    public Form setA13yy(String a13yy) {
        this.a13yy = a13yy;
        return this;
    }

    public String getA14mm() {
        return a14mm;
    }

    public Form setA14mm(String a14mm) {
        this.a14mm = a14mm;
        return this;
    }

    public String getA14yy() {
        return a14yy;
    }

    public Form setA14yy(String a14yy) {
        this.a14yy = a14yy;
        return this;
    }

    public String getA15() {
        return a15;
    }

    public Form setA15(String a15) {
        this.a15 = a15;
        return this;
    }

    public String getA16() {
        return a16;
    }

    public Form setA16(String a16) {
        this.a16 = a16;
        return this;
    }

    public String getA17() {
        return a17;
    }

    public Form setA17(String a17) {
        this.a17 = a17;
        return this;
    }

    public String getA18() {
        return a18;
    }

    public Form setA18(String a18) {
        this.a18 = a18;
        return this;
    }

    public String getA19() {
        return a19;
    }

    public Form setA19(String a19) {
        this.a19 = a19;
        return this;
    }

    public String getA20() {
        return a20;
    }

    public Form setA20(String a20) {
        this.a20 = a20;
        return this;
    }

    public String getA21() {
        return a21;
    }

    public Form setA21(String a21) {
        this.a21 = a21;
        return this;
    }

    public String getA22pos() {
        return a22pos;
    }

    public Form setA22pos(String a22pos) {
        this.a22pos = a22pos;
        return this;
    }

    public String getA22org() {
        return a22org;
    }

    public Form setA22org(String a22org) {
        this.a22org = a22org;
        return this;
    }

    public String getA23() {
        return a23;
    }

    public Form setA23(String a23) {
        this.a23 = a23;
        return this;
    }

    public String getB01() {
        return b01;
    }

    public Form setB01(String b01) {
        this.b01 = b01;
        return this;
    }

    public String getB02() {
        return b02;
    }

    public Form setB02(String b02) {
        this.b02 = b02;
        return this;
    }

    public String getB03() {
        return b03;
    }

    public Form setB03(String b03) {
        this.b03 = b03;
        return this;
    }

    public String getB04() {
        return b04;
    }

    public Form setB04(String b04) {
        this.b04 = b04;
        return this;
    }

    public String getB05() {
        return b05;
    }

    public Form setB05(String b05) {
        this.b05 = b05;
        return this;
    }

    public String getB06() {
        return b06;
    }

    public Form setB06(String b06) {
        this.b06 = b06;
        return this;
    }

    public String getB06ax() {
        return b06ax;
    }

    public Form setB06ax(String b06ax) {
        this.b06ax = b06ax;
        return this;
    }

    public String getB07() {
        return b07;
    }

    public Form setB07(String b07) {
        this.b07 = b07;
        return this;
    }

    public String getB0801() {
        return b0801;
    }

    public Form setB0801(String b0801) {
        this.b0801 = b0801;
        return this;
    }

    public String getB0802() {
        return b0802;
    }

    public Form setB0802(String b0802) {
        this.b0802 = b0802;
        return this;
    }

    public String getB0803() {
        return b0803;
    }

    public Form setB0803(String b0803) {
        this.b0803 = b0803;
        return this;
    }

    public String getB0804() {
        return b0804;
    }

    public Form setB0804(String b0804) {
        this.b0804 = b0804;
        return this;
    }

    public String getB0805() {
        return b0805;
    }

    public Form setB0805(String b0805) {
        this.b0805 = b0805;
        return this;
    }

    public String getB0806() {
        return b0806;
    }

    public Form setB0806(String b0806) {
        this.b0806 = b0806;
        return this;
    }

    public String getB0807() {
        return b0807;
    }

    public Form setB0807(String b0807) {
        this.b0807 = b0807;
        return this;
    }

    public String getB9() {
        return b9;
    }

    public Form setB9(String b9) {
        this.b9 = b9;
        return this;
    }

    public String getB10() {
        return b10;
    }

    public Form setB10(String b10) {
        this.b10 = b10;
        return this;
    }

    public String getB11() {
        return b11;
    }

    public Form setB11(String b11) {
        this.b11 = b11;
        return this;
    }

    public String getB11096() {
        return b11096;
    }

    public Form setB11096(String b11096) {
        this.b11096 = b11096;
        return this;
    }

    public String getB11096x() {
        return b11096x;
    }

    public Form setB11096x(String b11096x) {
        this.b11096x = b11096x;
        return this;
    }

    public String getB11mc() {
        return b11mc;
    }

    public Form setB11mc(String b11mc) {
        this.b11mc = b11mc;
        return this;
    }

    public String getB11ws() {
        return b11ws;
    }

    public Form setB11ws(String b11ws) {
        this.b11ws = b11ws;
        return this;
    }

    public String getB12() {
        return b12;
    }

    public Form setB12(String b12) {
        this.b12 = b12;
        return this;
    }

    public String getB1301() {
        return b1301;
    }

    public Form setB1301(String b1301) {
        this.b1301 = b1301;
        return this;
    }

    public String getB1302() {
        return b1302;
    }

    public Form setB1302(String b1302) {
        this.b1302 = b1302;
        return this;
    }

    public String getB1303() {
        return b1303;
    }

    public Form setB1303(String b1303) {
        this.b1303 = b1303;
        return this;
    }

    public String getB1304() {
        return b1304;
    }

    public Form setB1304(String b1304) {
        this.b1304 = b1304;
        return this;
    }

    public String getB1305() {
        return b1305;
    }

    public Form setB1305(String b1305) {
        this.b1305 = b1305;
        return this;
    }

    public String getB1306() {
        return b1306;
    }

    public Form setB1306(String b1306) {
        this.b1306 = b1306;
        return this;
    }

    public String getB1307() {
        return b1307;
    }

    public Form setB1307(String b1307) {
        this.b1307 = b1307;
        return this;
    }

    public String getB1308() {
        return b1308;
    }

    public Form setB1308(String b1308) {
        this.b1308 = b1308;
        return this;
    }

    public String getB1309() {
        return b1309;
    }

    public Form setB1309(String b1309) {
        this.b1309 = b1309;
        return this;
    }

    public String getB13096() {
        return b13096;
    }

    public Form setB13096(String b13096) {
        this.b13096 = b13096;
        return this;
    }

    public String getB14() {
        return b14;
    }

    public Form setB14(String b14) {
        this.b14 = b14;
        return this;
    }

    public String getB1501() {
        return b1501;
    }

    public Form setB1501(String b1501) {
        this.b1501 = b1501;
        return this;
    }

    public String getB1502() {
        return b1502;
    }

    public Form setB1502(String b1502) {
        this.b1502 = b1502;
        return this;
    }

    public String getB1503() {
        return b1503;
    }

    public Form setB1503(String b1503) {
        this.b1503 = b1503;
        return this;
    }

    public String getB1504() {
        return b1504;
    }

    public Form setB1504(String b1504) {
        this.b1504 = b1504;
        return this;
    }

    public String getB1505() {
        return b1505;
    }

    public Form setB1505(String b1505) {
        this.b1505 = b1505;
        return this;
    }

    public String getB15096() {
        return b15096;
    }

    public Form setB15096(String b15096) {
        this.b15096 = b15096;
        return this;
    }

    public String getB16() {
        return b16;
    }

    public Form setB16(String b16) {
        this.b16 = b16;
        return this;
    }

    public String getB17() {
        return b17;
    }

    public Form setB17(String b17) {
        this.b17 = b17;
        return this;
    }

    public String getC01() {
        return c01;
    }

    public Form setC01(String c01) {
        this.c01 = c01;
        return this;
    }

    public String getC0201() {
        return c0201;
    }

    public Form setC0201(String c0201) {
        this.c0201 = c0201;
        return this;
    }

    public String getC0202() {
        return c0202;
    }

    public Form setC0202(String c0202) {
        this.c0202 = c0202;
        return this;
    }

    public String getC03() {
        return c03;
    }

    public Form setC03(String c03) {
        this.c03 = c03;
        return this;
    }

    public String getC04() {
        return c04;
    }

    public Form setC04(String c04) {
        this.c04 = c04;
        return this;
    }

    public String getC05() {
        return c05;
    }

    public Form setC05(String c05) {
        this.c05 = c05;
        return this;
    }

    public String getC06() {
        return c06;
    }

    public Form setC06(String c06) {
        this.c06 = c06;
        return this;
    }

    public String getC07() {
        return c07;
    }

    public Form setC07(String c07) {
        this.c07 = c07;
        return this;
    }

    public String getC08() {
        return c08;
    }

    public Form setC08(String c08) {
        this.c08 = c08;
        return this;
    }

    public String getD1() {
        return d1;
    }

    public Form setD1(String d1) {
        this.d1 = d1;
        return this;
    }

    public String getD02() {
        return d02;
    }

    public Form setD02(String d02) {
        this.d02 = d02;
        return this;
    }

    public String getD03() {
        return d03;
    }

    public Form setD03(String d03) {
        this.d03 = d03;
        return this;
    }

    public String getD04() {
        return d04;
    }

    public Form setD04(String d04) {
        this.d04 = d04;
        return this;
    }

    public String getD05() {
        return d05;
    }

    public Form setD05(String d05) {
        this.d05 = d05;
        return this;
    }

    public String getE01() {
        return e01;
    }

    public Form setE01(String e01) {
        this.e01 = e01;
        return this;
    }

    public String getE02() {
        return e02;
    }

    public Form setE02(String e02) {
        this.e02 = e02;
        return this;
    }

    public String getE0201() {
        return e0201;
    }

    public Form setE0201(String e0201) {
        this.e0201 = e0201;
        return this;
    }

    public String getE0202() {
        return e0202;
    }

    public Form setE0202(String e0202) {
        this.e0202 = e0202;
        return this;
    }

    public String getE0301() {
        return e0301;
    }

    public Form setE0301(String e0301) {
        this.e0301 = e0301;
        return this;
    }

    public String getE0302() {
        return e0302;
    }

    public Form setE0302(String e0302) {
        this.e0302 = e0302;
        return this;
    }

    public String getE0303() {
        return e0303;
    }

    public Form setE0303(String e0303) {
        this.e0303 = e0303;
        return this;
    }

    public String getE0304() {
        return e0304;
    }

    public Form setE0304(String e0304) {
        this.e0304 = e0304;
        return this;
    }

    public String getE0305() {
        return e0305;
    }

    public Form setE0305(String e0305) {
        this.e0305 = e0305;
        return this;
    }

    public String getE0306() {
        return e0306;
    }

    public Form setE0306(String e0306) {
        this.e0306 = e0306;
        return this;
    }

    public String getE03096() {
        return e03096;
    }

    public Form setE03096(String e03096) {
        this.e03096 = e03096;
        return this;
    }

    public String getE04() {
        return e04;
    }

    public Form setE04(String e04) {
        this.e04 = e04;
        return this;
    }

    public String getE05() {
        return e05;
    }

    public Form setE05(String e05) {
        this.e05 = e05;
        return this;
    }

    public String getE06() {
        return e06;
    }

    public Form setE06(String e06) {
        this.e06 = e06;
        return this;
    }

    public String getE07() {
        return e07;
    }

    public Form setE07(String e07) {
        this.e07 = e07;
        return this;
    }

    public String getE0801() {
        return e0801;
    }

    public Form setE0801(String e0801) {
        this.e0801 = e0801;
        return this;
    }

    public String getE0802() {
        return e0802;
    }

    public Form setE0802(String e0802) {
        this.e0802 = e0802;
        return this;
    }

    public String getE0803() {
        return e0803;
    }

    public Form setE0803(String e0803) {
        this.e0803 = e0803;
        return this;
    }

    public String getE0804() {
        return e0804;
    }

    public Form setE0804(String e0804) {
        this.e0804 = e0804;
        return this;
    }

    public String getE0805() {
        return e0805;
    }

    public Form setE0805(String e0805) {
        this.e0805 = e0805;
        return this;
    }

    public String getE0806() {
        return e0806;
    }

    public Form setE0806(String e0806) {
        this.e0806 = e0806;
        return this;
    }

    public String getE08096() {
        return e08096;
    }

    public Form setE08096(String e08096) {
        this.e08096 = e08096;
        return this;
    }

    public String getE09() {
        return e09;
    }

    public Form setE09(String e09) {
        this.e09 = e09;
        return this;
    }

    public String getE10() {
        return e10;
    }

    public Form setE10(String e10) {
        this.e10 = e10;
        return this;
    }

    public String getE1101() {
        return e1101;
    }

    public Form setE1101(String e1101) {
        this.e1101 = e1101;
        return this;
    }

    public String getE1102() {
        return e1102;
    }

    public Form setE1102(String e1102) {
        this.e1102 = e1102;
        return this;
    }

    public String getE1103() {
        return e1103;
    }

    public Form setE1103(String e1103) {
        this.e1103 = e1103;
        return this;
    }

    public String getE1104() {
        return e1104;
    }

    public Form setE1104(String e1104) {
        this.e1104 = e1104;
        return this;
    }

    public String getE1105() {
        return e1105;
    }

    public Form setE1105(String e1105) {
        this.e1105 = e1105;
        return this;
    }

    public String getE1106() {
        return e1106;
    }

    public Form setE1106(String e1106) {
        this.e1106 = e1106;
        return this;
    }

    public String getE12() {
        return e12;
    }

    public Form setE12(String e12) {
        this.e12 = e12;
        return this;
    }

    public String getE13() {
        return e13;
    }

    public Form setE13(String e13) {
        this.e13 = e13;
        return this;
    }

    public String getE1401() {
        return e1401;
    }

    public Form setE1401(String e1401) {
        this.e1401 = e1401;
        return this;
    }

    public String getE1402() {
        return e1402;
    }

    public Form setE1402(String e1402) {
        this.e1402 = e1402;
        return this;
    }

    public String getE15() {
        return e15;
    }

    public Form setE15(String e15) {
        this.e15 = e15;
        return this;
    }

    public String getF01() {
        return f01;
    }

    public Form setF01(String f01) {
        this.f01 = f01;
        return this;
    }

    public String getF02() {
        return f02;
    }

    public Form setF02(String f02) {
        this.f02 = f02;
        return this;
    }

    public String getF03() {
        return f03;
    }

    public Form setF03(String f03) {
        this.f03 = f03;
        return this;
    }

    public String getF04() {
        return f04;
    }

    public Form setF04(String f04) {
        this.f04 = f04;
        return this;
    }

    public String getF05() {
        return f05;
    }

    public Form setF05(String f05) {
        this.f05 = f05;
        return this;
    }

    public String getF06() {
        return f06;
    }

    public Form setF06(String f06) {
        this.f06 = f06;
        return this;
    }

    public String getF07() {
        return f07;
    }

    public Form setF07(String f07) {
        this.f07 = f07;
        return this;
    }

    public String getF08() {
        return f08;
    }

    public Form setF08(String f08) {
        this.f08 = f08;
        return this;
    }

    public String getF09dd() {
        return f09dd;
    }

    public Form setF09dd(String f09dd) {
        this.f09dd = f09dd;
        return this;
    }

    public String getF09mm() {
        return f09mm;
    }

    public Form setF09mm(String f09mm) {
        this.f09mm = f09mm;
        return this;
    }

    public String getF09yy() {
        return f09yy;
    }

    public Form setF09yy(String f09yy) {
        this.f09yy = f09yy;
        return this;
    }

    public String getF10() {
        return f10;
    }

    public Form setF10(String f10) {
        this.f10 = f10;
        return this;
    }

    public String getF11dd() {
        return f11dd;
    }

    public Form setF11dd(String f11dd) {
        this.f11dd = f11dd;
        return this;
    }

    public String getF11mm() {
        return f11mm;
    }

    public Form setF11mm(String f11mm) {
        this.f11mm = f11mm;
        return this;
    }

    public String getF11yy() {
        return f11yy;
    }

    public Form setF11yy(String f11yy) {
        this.f11yy = f11yy;
        return this;
    }

    public String getF12() {
        return f12;
    }

    public Form setF12(String f12) {
        this.f12 = f12;
        return this;
    }

    public String getF13() {
        return f13;
    }

    public Form setF13(String f13) {
        this.f13 = f13;
        return this;
    }


    public String getF14() {
        return f14;
    }

    public Form setF14(String f14) {
        this.f14 = f14;
        return this;
    }

    public String getF15() {
        return f15;
    }

    public Form setF15(String f15) {
        this.f15 = f15;
        return this;
    }

    public String getF16() {
        return f16;
    }

    public Form setF16(String f16) {
        this.f16 = f16;
        return this;
    }

    public String getF17() {
        return f17;
    }

    public Form setF17(String f17) {
        this.f17 = f17;
        return this;
    }

    public String getG01() {
        return g01;
    }

    public Form setG01(String g01) {
        this.g01 = g01;
        return this;
    }

    public String getG02() {
        return g02;
    }

    public Form setG02(String g02) {
        this.g02 = g02;
        return this;
    }

    public String getG03() {
        return g03;
    }

    public Form setG03(String g03) {
        this.g03 = g03;
        return this;
    }

    public String getG04() {
        return g04;
    }

    public Form setG04(String g04) {
        this.g04 = g04;
        return this;
    }

    public String getG04096x() {
        return g04096x;
    }

    public Form setG04096x(String g04096x) {
        this.g04096x = g04096x;
        return this;
    }

    public String getG0501() {
        return g0501;
    }

    public Form setG0501(String g0501) {
        this.g0501 = g0501;
        return this;
    }

    public String getG0502() {
        return g0502;
    }

    public Form setG0502(String g0502) {
        this.g0502 = g0502;
        return this;
    }

    public String getG0503() {
        return g0503;
    }

    public Form setG0503(String g0503) {
        this.g0503 = g0503;
        return this;
    }

    public String getG0504() {
        return g0504;
    }

    public Form setG0504(String g0504) {
        this.g0504 = g0504;
        return this;
    }

    public String getG0505() {
        return g0505;
    }

    public Form setG0505(String g0505) {
        this.g0505 = g0505;
        return this;
    }

    public String getG0506() {
        return g0506;
    }

    public Form setG0506(String g0506) {
        this.g0506 = g0506;
        return this;
    }

    public String getG0507() {
        return g0507;
    }

    public Form setG0507(String g0507) {
        this.g0507 = g0507;
        return this;
    }

    public String getG0508() {
        return g0508;
    }

    public Form setG0508(String g0508) {
        this.g0508 = g0508;
        return this;
    }

    public String getG0509() {
        return g0509;
    }

    public Form setG0509(String g0509) {
        this.g0509 = g0509;
        return this;
    }

    public String getG0510() {
        return g0510;
    }

    public Form setG0510(String g0510) {
        this.g0510 = g0510;
        return this;
    }

    public String getG0511() {
        return g0511;
    }

    public Form setG0511(String g0511) {
        this.g0511 = g0511;
        return this;
    }

    public String getG0512() {
        return g0512;
    }

    public Form setG0512(String g0512) {
        this.g0512 = g0512;
        return this;
    }

    public String getG0513() {
        return g0513;
    }

    public Form setG0513(String g0513) {
        this.g0513 = g0513;
        return this;
    }

    public String getG06() {
        return g06;
    }

    public Form setG06(String g06) {
        this.g06 = g06;
        return this;
    }

    public String getG0701() {
        return g0701;
    }

    public Form setG0701(String g0701) {
        this.g0701 = g0701;
        return this;
    }

    public String getG0702() {
        return g0702;
    }

    public Form setG0702(String g0702) {
        this.g0702 = g0702;
        return this;
    }

    public String getG0703() {
        return g0703;
    }

    public Form setG0703(String g0703) {
        this.g0703 = g0703;
        return this;
    }

    public String getG0704() {
        return g0704;
    }

    public Form setG0704(String g0704) {
        this.g0704 = g0704;
        return this;
    }

    public String getG0705() {
        return g0705;
    }

    public Form setG0705(String g0705) {
        this.g0705 = g0705;
        return this;
    }

    public String getG0706() {
        return g0706;
    }

    public Form setG0706(String g0706) {
        this.g0706 = g0706;
        return this;
    }

    public String getG0707() {
        return g0707;
    }

    public Form setG0707(String g0707) {
        this.g0707 = g0707;
        return this;
    }

    public String getG0801() {
        return g0801;
    }

    public Form setG0801(String g0801) {
        this.g0801 = g0801;
        return this;
    }

    public String getG0802() {
        return g0802;
    }

    public Form setG0802(String g0802) {
        this.g0802 = g0802;
        return this;
    }

    public String getG0803() {
        return g0803;
    }

    public Form setG0803(String g0803) {
        this.g0803 = g0803;
        return this;
    }

    public String getG0804() {
        return g0804;
    }

    public Form setG0804(String g0804) {
        this.g0804 = g0804;
        return this;
    }

    public String getG0805() {
        return g0805;
    }

    public Form setG0805(String g0805) {
        this.g0805 = g0805;
        return this;
    }

    public String getG0806() {
        return g0806;
    }

    public Form setG0806(String g0806) {
        this.g0806 = g0806;
        return this;
    }

    public String getG0807() {
        return g0807;
    }

    public Form setG0807(String g0807) {
        this.g0807 = g0807;
        return this;
    }

    public String getG0808() {
        return g0808;
    }

    public Form setG0808(String g0808) {
        this.g0808 = g0808;
        return this;
    }

    public String getG0809() {
        return g0809;
    }

    public Form setG0809(String g0809) {
        this.g0809 = g0809;
        return this;
    }

    public String getG08096() {
        return g08096;
    }

    public Form setG08096(String g08096) {
        this.g08096 = g08096;
        return this;
    }

    public String getG09() {
        return g09;
    }

    public Form setG09(String g09) {
        this.g09 = g09;
        return this;
    }

    public String getG10() {
        return g10;
    }

    public Form setG10(String g10) {
        this.g10 = g10;
        return this;
    }

    public String getG11() {
        return g11;
    }

    public Form setG11(String g11) {
        this.g11 = g11;
        return this;
    }

    public String getG12() {
        return g12;
    }

    public Form setG12(String g12) {
        this.g12 = g12;
        return this;
    }

    public String getG12096x() {
        return g12096x;
    }

    public Form setG12096x(String g12096x) {
        this.g12096x = g12096x;
        return this;
    }

    public String getG13() {
        return g13;
    }

    public Form setG13(String g13) {
        this.g13 = g13;
        return this;
    }

    public String getG13096x() {
        return g13096x;
    }

    public Form setG13096x(String g13096x) {
        this.g13096x = g13096x;
        return this;
    }

    public String getH01a() {
        return h01a;
    }

    public void setH01a(String h01a) {
        this.h01a = h01a;
    }

    public String getH01dd() {
        return h01dd;
    }

    public Form setH01dd(String h01dd) {
        this.h01dd = h01dd;
        return this;
    }

    public String getH01mm() {
        return h01mm;
    }

    public Form setH01mm(String h01mm) {
        this.h01mm = h01mm;
        return this;
    }

    public String getH01yy() {
        return h01yy;
    }

    public Form setH01yy(String h01yy) {
        this.h01yy = h01yy;
        return this;
    }

    public String getH02dd() {
        return h02dd;
    }

    public Form setH02dd(String h02dd) {
        this.h02dd = h02dd;
        return this;
    }

    public String getH02mm() {
        return h02mm;
    }

    public Form setH02mm(String h02mm) {
        this.h02mm = h02mm;
        return this;
    }

    public String getH02yy() {
        return h02yy;
    }

    public Form setH02yy(String h02yy) {
        this.h02yy = h02yy;
        return this;
    }

    public String getH0301() {
        return h0301;
    }

    public Form setH0301(String h0301) {
        this.h0301 = h0301;
        return this;
    }

    public String getH0302() {
        return h0302;
    }

    public Form setH0302(String h0302) {
        this.h0302 = h0302;
        return this;
    }

    public String getH0303() {
        return h0303;
    }

    public Form setH0303(String h0303) {
        this.h0303 = h0303;
        return this;
    }

    public String getH0304() {
        return h0304;
    }

    public Form setH0304(String h0304) {
        this.h0304 = h0304;
        return this;
    }

    public String getH0305() {
        return h0305;
    }

    public Form setH0305(String h0305) {
        this.h0305 = h0305;
        return this;
    }

    public String getH0306() {
        return h0306;
    }

    public Form setH0306(String h0306) {
        this.h0306 = h0306;
        return this;
    }

    public String getH0307() {
        return h0307;
    }

    public Form setH0307(String h0307) {
        this.h0307 = h0307;
        return this;
    }

    public String getH0308() {
        return h0308;
    }

    public Form setH0308(String h0308) {
        this.h0308 = h0308;
        return this;
    }

    public String getH0309() {
        return h0309;
    }

    public Form setH0309(String h0309) {
        this.h0309 = h0309;
        return this;
    }

    public String getH0310() {
        return h0310;
    }

    public Form setH0310(String h0310) {
        this.h0310 = h0310;
        return this;
    }

    public String getH0311() {
        return h0311;
    }

    public Form setH0311(String h0311) {
        this.h0311 = h0311;
        return this;
    }

    public String getH0312() {
        return h0312;
    }

    public Form setH0312(String h0312) {
        this.h0312 = h0312;
        return this;
    }

    public String getH0313() {
        return h0313;
    }

    public Form setH0313(String h0313) {
        this.h0313 = h0313;
        return this;
    }

    public String getH0314() {
        return h0314;
    }

    public Form setH0314(String h0314) {
        this.h0314 = h0314;
        return this;
    }

    public String getH0315() {
        return h0315;
    }

    public Form setH0315(String h0315) {
        this.h0315 = h0315;
        return this;
    }

    public String getH0316() {
        return h0316;
    }

    public Form setH0316(String h0316) {
        this.h0316 = h0316;
        return this;
    }

    public String getH03096() {
        return h03096;
    }

    public Form setH03096(String h03096) {
        this.h03096 = h03096;
        return this;
    }

    public String getH03096x() {
        return h03096x;
    }

    public Form setH03096x(String h03096x) {
        this.h03096x = h03096x;
        return this;
    }

    public String getH04() {
        return h04;
    }

    public Form setH04(String h04) {
        this.h04 = h04;
        return this;
    }

    public String getH05() {
        return h05;
    }

    public Form setH05(String h05) {
        this.h05 = h05;
        return this;
    }

    public String getH06() {
        return h06;
    }

    public Form setH06(String h06) {
        this.h06 = h06;
        return this;
    }

    public String getH0701() {
        return h0701;
    }

    public Form setH0701(String h0701) {
        this.h0701 = h0701;
        return this;
    }

    public String getH0702() {
        return h0702;
    }

    public Form setH0702(String h0702) {
        this.h0702 = h0702;
        return this;
    }

    public String getH0801() {
        return h0801;
    }

    public Form setH0801(String h0801) {
        this.h0801 = h0801;
        return this;
    }

    public String getH0802() {
        return h0802;
    }

    public Form setH0802(String h0802) {
        this.h0802 = h0802;
        return this;
    }

    public String getH0803() {
        return h0803;
    }

    public Form setH0803(String h0803) {
        this.h0803 = h0803;
        return this;
    }

    public String getH0804() {
        return h0804;
    }

    public Form setH0804(String h0804) {
        this.h0804 = h0804;
        return this;
    }

    public String getH08096() {
        return h08096;
    }

    public Form setH08096(String h08096) {
        this.h08096 = h08096;
        return this;
    }

    public String getH08096x() {
        return h08096x;
    }

    public Form setH08096x(String h08096x) {
        this.h08096x = h08096x;
        return this;
    }

    public String getH09() {
        return h09;
    }

    public Form setH09(String h09) {
        this.h09 = h09;
        return this;
    }

    public String getH10() {
        return h10;
    }

    public Form setH10(String h10) {
        this.h10 = h10;
        return this;
    }

    public String getH11() {
        return h11;
    }

    public Form setH11(String h11) {
        this.h11 = h11;
        return this;
    }

    public String getH11096x() {
        return h11096x;
    }

    public Form setH11096x(String h11096x) {
        this.h11096x = h11096x;
        return this;
    }


    public String getH12dd() {
        return h12dd;
    }

    public Form setH12dd(String h12dd) {
        this.h12dd = h12dd;
        return this;
    }

    public String getH12mm() {
        return h12mm;
    }

    public Form setH12mm(String h12mm) {
        this.h12mm = h12mm;
        return this;
    }

    public String getH12yy() {
        return h12yy;
    }

    public Form setH12yy(String h12yy) {
        this.h12yy = h12yy;
        return this;
    }

    public String getH13() {
        return h13;
    }

    public Form setH13(String h13) {
        this.h13 = h13;
        return this;
    }

    public String getH13096x() {
        return h13096x;
    }

    public Form setH13096x(String h13096x) {
        this.h13096x = h13096x;
        return this;
    }

    public String getH14() {
        return h14;
    }

    public Form setH14(String h14) {
        this.h14 = h14;
        return this;
    }

    public String getH14096x() {
        return h14096x;
    }

    public Form setH14096x(String h14096x) {
        this.h14096x = h14096x;
        return this;
    }

    public String getH15() {
        return h15;
    }

    public Form setH15(String h15) {
        this.h15 = h15;
        return this;
    }

    public String getH16() {
        return h16;
    }

    public Form setH16(String h16) {
        this.h16 = h16;
        return this;
    }

    public String getH17() {
        return h17;
    }

    public Form setH17(String h17) {
        this.h17 = h17;
        return this;
    }

    public String getH1801() {
        return h1801;
    }

    public Form setH1801(String h1801) {
        this.h1801 = h1801;
        return this;
    }

    public String getH1802() {
        return h1802;
    }

    public Form setH1802(String h1802) {
        this.h1802 = h1802;
        return this;
    }

    public String getI01() {
        return i01;
    }

    public Form setI01(String i01) {
        this.i01 = i01;
        return this;
    }

    public String getI02() {
        return i02;
    }

    public Form setI02(String i02) {
        this.i02 = i02;
        return this;
    }

    public String getI03() {
        return i03;
    }

    public Form setI03(String i03) {
        this.i03 = i03;
        return this;
    }

    public String getI04096x() {
        return i04096x;
    }

    public Form setI04096x(String i04096x) {
        this.i04096x = i04096x;
        return this;
    }

    public String getI05() {
        return i05;
    }

    public Form setI05(String i05) {
        this.i05 = i05;
        return this;
    }

    public String getI06() {
        return i06;
    }

    public Form setI06(String i06) {
        this.i06 = i06;
        return this;
    }

    public String getI07() {
        return i07;
    }

    public Form setI07(String i07) {
        this.i07 = i07;
        return this;
    }

    public String getJ01() {
        return j01;
    }

    public Form setJ01(String j01) {
        this.j01 = j01;
        return this;
    }

    public String getJ02() {
        return j02;
    }

    public Form setJ02(String j02) {
        this.j02 = j02;
        return this;
    }

    public String getJ03() {
        return j03;
    }

    public Form setJ03(String j03) {
        this.j03 = j03;
        return this;
    }

    public String getJ04() {
        return j04;
    }

    public Form setJ04(String j04) {
        this.j04 = j04;
        return this;
    }

    public String getJ05() {
        return j05;
    }

    public Form setJ05(String j05) {
        this.j05 = j05;
        return this;
    }

    public String getJ06() {
        return j06;
    }

    public Form setJ06(String j06) {
        this.j06 = j06;
        return this;
    }

    public String getJ07() {
        return j07;
    }

    public Form setJ07(String j07) {
        this.j07 = j07;
        return this;
    }

    public String getJ0801() {
        return j0801;
    }

    public Form setJ0801(String j0801) {
        this.j0801 = j0801;
        return this;
    }

    public String getJ0802() {
        return j0802;
    }

    public Form setJ0802(String j0802) {
        this.j0802 = j0802;
        return this;
    }

    public String getJ0803() {
        return j0803;
    }

    public Form setJ0803(String j0803) {
        this.j0803 = j0803;
        return this;
    }

    public String getJ0804() {
        return j0804;
    }

    public Form setJ0804(String j0804) {
        this.j0804 = j0804;
        return this;
    }

    public String getJ0805() {
        return j0805;
    }

    public Form setJ0805(String j0805) {
        this.j0805 = j0805;
        return this;
    }

    public String getJ0806() {
        return j0806;
    }

    public Form setJ0806(String j0806) {
        this.j0806 = j0806;
        return this;
    }

    public String getJ08096() {
        return j08096;
    }

    public Form setJ08096(String j08096) {
        this.j08096 = j08096;
        return this;
    }

    public String getJ08096x() {
        return j08096x;
    }

    public Form setJ08096x(String j08096x) {
        this.j08096x = j08096x;
        return this;
    }

    public String getJ09() {
        return j09;
    }

    public Form setJ09(String j09) {
        this.j09 = j09;
        return this;
    }

    public String getJ09096x() {
        return j09096x;
    }

    public Form setJ09096x(String j09096x) {
        this.j09096x = j09096x;
        return this;
    }

    public String getJ010() {
        return j010;
    }

    public Form setJ010(String j010) {
        this.j010 = j010;
        return this;
    }

    public String getJ011() {
        return j011;
    }

    public Form setJ011(String j011) {
        this.j011 = j011;
        return this;
    }

    public String getJ012() {
        return j012;
    }

    public Form setJ012(String j012) {
        this.j012 = j012;
        return this;
    }

    public String getK01() {
        return k01;
    }

    public Form setK01(String k01) {
        this.k01 = k01;
        return this;
    }

    public String getK02() {
        return k02;
    }

    public Form setK02(String k02) {
        this.k02 = k02;
        return this;
    }

    public String getK03() {
        return k03;
    }

    public Form setK03(String k03) {
        this.k03 = k03;
        return this;
    }

    public String getK04() {
        return k04;
    }

    public Form setK04(String k04) {
        this.k04 = k04;
        return this;
    }

    public String getK05() {
        return k05;
    }

    public Form setK05(String k05) {
        this.k05 = k05;
        return this;
    }

    public String getk05096x() {
        return k05096x;
    }

    public String getK06() {
        return k06;
    }

    public Form setK06(String k06) {
        this.k06 = k06;
        return this;
    }

    public String getK07() {
        return k07;
    }

    public Form setK07(String k07) {
        this.k07 = k07;
        return this;
    }

    public String getK08() {
        return k08;
    }

    public Form setK08(String k08) {
        this.k08 = k08;
        return this;
    }

    public String getK09() {
        return k09;
    }

    public Form setK09(String k09) {
        this.k09 = k09;
        return this;
    }

    public String getK10() {
        return k10;
    }

    public Form setK10(String k10) {
        this.k10 = k10;
        return this;
    }

    public String getK11() {
        return k11;
    }

    public Form setK11(String k11) {
        this.k11 = k11;
        return this;
    }

    public String getK12() {
        return k12;
    }

    public Form setK12(String k12) {
        this.k12 = k12;
        return this;
    }

    public String getK13() {
        return k13;
    }

    public Form setK13(String k13) {
        this.k13 = k13;
        return this;
    }

    public String getK14() {
        return k14;
    }

    public Form setK14(String k14) {
        this.k14 = k14;
        return this;
    }

    public String getk14096x() {
        return k14096x;
    }

    public String getK15() {
        return k15;
    }

    public Form setK15(String k15) {
        this.k15 = k15;
        return this;
    }

    public String getK16() {
        return k16;
    }

    public Form setK16(String k16) {
        this.k16 = k16;
        return this;
    }

    public String getk16096x() {
        return k16096x;
    }

    public String getK17() {
        return k17;
    }

    public Form setK17(String k17) {
        this.k17 = k17;
        return this;
    }

    public String getL01() {
        return l01;
    }

    public Form setL01(String l01) {
        this.l01 = l01;
        return this;
    }

    public String getL02() {
        return l02;
    }

    public Form setL02(String l02) {
        this.l02 = l02;
        return this;
    }

    public String getl02096x() {
        return l02096x;
    }

    public String getL03() {
        return l03;
    }

    public Form setL03(String l03) {
        this.l03 = l03;
        return this;
    }

    public String getL04() {
        return l04;
    }

    public Form setL04(String l04) {
        this.l04 = l04;
        return this;
    }

    public String getL05() {
        return l05;
    }

    public Form setL05(String l05) {
        this.l05 = l05;
        return this;
    }

    public String getL06() {
        return l06;
    }

    public Form setL06(String l06) {
        this.l06 = l06;
        return this;
    }

    public String getL07() {
        return l07;
    }

    public Form setL07(String l07) {
        this.l07 = l07;
        return this;
    }

    public String getL08() {
        return l08;
    }

    public Form setL08(String l08) {
        this.l08 = l08;
        return this;
    }

    public String getL09() {
        return l09;
    }

    public Form setL09(String l09) {
        this.l09 = l09;
        return this;
    }

    public String getL010() {
        return l010;
    }

    public Form setL010(String l010) {
        this.l010 = l010;
        return this;
    }

    public String getGpslat() {
        return gpslat;
    }

    public Form setGpslat(String gpslat) {
        this.gpslat = gpslat;
        return this;
    }

    public String getGpslng() {
        return gpslng;
    }

    public Form setGpslng(String gpslng) {
        this.gpslng = gpslng;
        return this;
    }

    public String getGpsdate() {
        return gpsdate;
    }

    public Form setGpsdate(String gpsdate) {
        this.gpsdate = gpsdate;
        return this;
    }

    public String getGpsacc() {
        return gpsacc;
    }

    public Form setGpsacc(String gpsacc) {
        this.gpsacc = gpsacc;
        return this;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public Form setDeviceid(String deviceid) {
        this.deviceid = deviceid;
        return this;
    }

    public String getTagid() {
        return tagid;
    }

    public Form setTagid(String tagid) {
        this.tagid = tagid;
        return this;
    }

    public String getA05() {
        return a05;
    }

    public void setA05(String a05) {
        this.a05 = a05;
    }

    public String getA05a() {
        return a05a;
    }

    public Form setA05a(String a05a) {
        this.a05a = a05a;
        return this;
    }

    public String getA05b() {
        return a05b;
    }

    public Form setA05b(String a05b) {
        this.a05b = a05b;
        return this;
    }
//======================

    public String getK05096x() {
        return k05096x;
    }

    public Form setk05096x(String k05096x) {
        this.k05096x = k05096x;
        return this;
    }

    public Form setK05096x(String k05096x) {
        this.k05096x = k05096x;
        return this;
    }

    public String getK14096x() {
        return k14096x;
    }

    public Form setk14096x(String k14096x) {
        this.k14096x = k14096x;
        return this;
    }

    public Form setK14096x(String k14096x) {
        this.k14096x = k14096x;
        return this;
    }

    public String getK16096x() {
        return k16096x;
    }

    public Form setk16096x(String k16096x) {
        this.k16096x = k16096x;
        return this;
    }

    public Form setK16096x(String k16096x) {
        this.k16096x = k16096x;
        return this;
    }

    public String getL02096x() {
        return l02096x;
    }

    public Form setl02096x(String l02096x) {
        this.l02096x = l02096x;
        return this;
    }

    public Form setL02096x(String l02096x) {
        this.l02096x = l02096x;
        return this;
    }


    //====================

    public String getsB() {
        return sB;
    }

    public void setsB(String sB) {
        this.sB = sB;
    }


    public String getsC() {
        return sC;
    }

    public void setsC(String sC) {
        this.sC = sC;
    }


    public String getsD() {
        return sD;
    }

    public void setsD(String sD) {
        this.sD = sD;
    }


    public String getsE() {
        return sE;
    }

    public void setsE(String sE) {
        this.sE = sE;
    }


    public String getsF() {
        return sF;
    }

    public void setsF(String sF) {
        this.sF = sF;
    }


    public String getsG() {
        return sG;
    }

    public void setsG(String sG) {
        this.sG = sG;
    }


    public String getsH() {
        return sH;
    }

    public void setsH(String sH) {
        this.sH = sH;
    }


    public String getsI() {
        return sI;
    }

    public void setsI(String sI) {
        this.sI = sI;
    }


    public String getsJ() {
        return sJ;
    }

    public void setsJ(String sJ) {
        this.sJ = sJ;
    }


    public String getsK() {
        return sK;
    }

    public void setsK(String sK) {
        this.sK = sK;
    }


    public String getsL() {
        return sL;
    }

    public void setsL(String sL) {
        this.sL = sL;
    }


    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    public String getProjectName() {
        return projectName;
    }

    public String get_ID() {
        return _ID;
    }

    public void set_ID(String _ID) {
        this._ID = _ID;
    }

    public String get_UID() {
        return _UID;
    }

    public void set_UID(String _UID) {
        this._UID = _UID;
    }

    public String getA01() {
        return a01;
    }

    public void setA01(String a01) {
        this.a01 = a01;
    }

    public String getA02() {
        return a02;
    }

    public void setA02(String a02) {
        this.a02 = a02;
    }

    public String getA03() {
        return a03;
    }

    public void setA03(String a03) {
        this.a03 = a03;
    }


    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }

    public String getIstatus96x() {
        return istatus96x;
    }

    public void setIstatus96x(String istatus96x) {
        this.istatus96x = istatus96x;
    }


    public String getEndingdatetime() {
        return endingdatetime;
    }

    public void setEndingdatetime(String endingdatetime) {
        this.endingdatetime = endingdatetime;
    }


    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }


    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }


    public String getGpsDT() {
        return gpsDT;
    }

    public void setGpsDT(String gpsDT) {
        this.gpsDT = gpsDT;
    }


    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }


    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }


    public String getDevicetagID() {
        return devicetagID;
    }

    public void setDevicetagID(String devicetagID) {
        this.devicetagID = devicetagID;
    }


    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }


    public String getSynced_date() {
        return synced_date;
    }

    public void setSynced_date(String synced_date) {
        this.synced_date = synced_date;

    }


    public String getRefno() {
        return refno;
    }

    public void setRefno(String refno) {
        this.refno = refno;
    }


    public Form Sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getString(FormsTable.COLUMN_ID);
        this._UID = jsonObject.getString(FormsTable.COLUMN_UID);
        this.sysdate = jsonObject.getString(FormsTable.COLUMN_SYSDATE);
        this.a01 = jsonObject.getString(FormsTable.COLUMN_A01);
        this.a02 = jsonObject.getString(FormsTable.COLUMN_A02);
        this.a03 = jsonObject.getString(FormsTable.COLUMN_A03);
        this.a04 = jsonObject.getString(FormsTable.COLUMN_A04);
        this.a05 = jsonObject.getString(FormsTable.COLUMN_A05);
        this.refno = jsonObject.getString(FormsTable.COLUMN_REFNO);
        this.istatus = jsonObject.getString(FormsTable.COLUMN_ISTATUS);
        this.istatus96x = jsonObject.getString(FormsTable.COLUMN_ISTATUS96x);
        this.endingdatetime = jsonObject.getString(FormsTable.COLUMN_ENDINGDATETIME);
        this.gpsLat = jsonObject.getString(FormsTable.COLUMN_GPSLAT);
        this.gpsLng = jsonObject.getString(FormsTable.COLUMN_GPSLNG);
        this.gpsDT = jsonObject.getString(FormsTable.COLUMN_GPSDATE);
        this.gpsAcc = jsonObject.getString(FormsTable.COLUMN_GPSACC);
        this.deviceID = jsonObject.getString(FormsTable.COLUMN_DEVICEID);
        this.devicetagID = jsonObject.getString(FormsTable.COLUMN_DEVICETAGID);
        this.synced = jsonObject.getString(FormsTable.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);
        this.appversion = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);
        this.sInfo = jsonObject.getString(FormsTable.COLUMN_SINFO);
        this.sB = jsonObject.getString(FormsTable.COLUMN_SB);
        this.sC = jsonObject.getString(FormsTable.COLUMN_SC);
        this.sD = jsonObject.getString(FormsTable.COLUMN_SD);
        this.sE = jsonObject.getString(FormsTable.COLUMN_SE);
        this.sF = jsonObject.getString(FormsTable.COLUMN_SF);
        this.sG = jsonObject.getString(FormsTable.COLUMN_SG);
        this.sH = jsonObject.getString(FormsTable.COLUMN_SH);
        this.sI = jsonObject.getString(FormsTable.COLUMN_SI);
        this.sJ = jsonObject.getString(FormsTable.COLUMN_SJ);
        this.sK = jsonObject.getString(FormsTable.COLUMN_SK);
        this.sL = jsonObject.getString(FormsTable.COLUMN_SL);

        return this;

    }

    public Form Hydrate(Cursor cursor) {
        this._ID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ID));
        this._UID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UID));
        this.sysdate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYSDATE));
        this.a01 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A01));
        this.a02 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A02));
        this.a03 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A03));
        this.a04 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A04));
        this.a05 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A05));
        this.refno = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_REFNO));
        this.istatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS));
        this.istatus96x = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS96x));
        this.endingdatetime = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ENDINGDATETIME));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLNG));
        this.gpsDT = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSDATE));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICETAGID));
        this.appversion = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_APPVERSION));
/*        this.sInfo = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SINFO));
        this.sB = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SB));
        this.sD = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SD));
        this.sE = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SE));
        this.sF = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SF));
        this.sG = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SG));
        this.sH = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH));
        this.sI = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SI));
        this.sJ = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SJ));
        this.sK = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SK));
        this.sL = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SL));*/
        sInfoHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SINFO)));
        sBHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SB)));
        sCHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC)));
        sDHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SD)));
        sEHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SE)));
        sFHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SF)));
        sGHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SG)));
        sHHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH)));
        sIHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SI)));
        sJHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SJ)));
        sKHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SK)));
        sLHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SL)));


        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Form.class);
    }

    public String sInfotoString() {
        JSONObject json = new JSONObject();

        try {
            json
                    .put("a05a", a05a)
                    .put("a05b", a05b)
                    .put("refno", refno)
                    .put("istatus", istatus)
                    .put("istatus96x", istatus96x)
                    .put("endingdatetime", endingdatetime)
                    .put("a06", a06)
                    .put("a07", a07)
                    .put("a08", a08)
                    .put("a09", a09)
                    .put("a10", a10)
                    .put("a11", a11)
                    .put("a12", a12)
                    .put("a13dd", a13dd)
                    .put("a13mm", a13mm)
                    .put("a13yy", a13yy)
                    .put("a14mm", a14mm)
                    .put("a14yy", a14yy)
                    .put("a15", a15)
                    .put("a16", a16)
                    .put("a17", a17)
                    .put("a18", a18)
                    .put("a19", a19)
                    .put("a20", a20)
                    .put("a21", a21)
                    .put("a22pos", a22pos)
                    .put("a22org", a22org)
                    .put("a23", a23);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public String sBtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("b01", b01)
                    .put("b02", b02)
                    .put("b03", b03)
                    .put("b04", b04)
                    .put("b05", b05)
                    .put("b06", b06)
                    .put("b06ax", b06ax)
                    .put("b07", b07)
                    .put("b0801", b0801)
                    .put("b0802", b0802)
                    .put("b0803", b0803)
                    .put("b0804", b0804)
                    .put("b0805", b0805)
                    .put("b0806", b0806)
                    .put("b0807", b0807)
                    .put("b9", b9)
                    .put("b10", b10)
                    .put("b11", b11)
                    .put("b11096", b11096)
                    .put("b11096x", b11096x)
                    .put("b11mc", b11mc)
                    .put("b11ws", b11ws)
                    .put("b12", b12)
                    .put("b1301", b1301)
                    .put("b1302", b1302)
                    .put("b1303", b1303)
                    .put("b1304", b1304)
                    .put("b1305", b1305)
                    .put("b1306", b1306)
                    .put("b1307", b1307)
                    .put("b1308", b1308)
                    .put("b1309", b1309)
                    .put("b13096", b13096)
                    .put("b14", b14)
                    .put("b1501", b1501)
                    .put("b1502", b1502)
                    .put("b1503", b1503)
                    .put("b1504", b1504)
                    .put("b1505", b1505)
                    .put("b15096", b15096)
                    .put("b16", b16)
                    .put("b17", b17);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public String sCtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("c01", c01)
                    .put("c0201", c0201)
                    .put("c0202", c0202)
                    .put("c03", c03)
                    .put("c04", c04)
                    .put("c05", c05)
                    .put("c06", c06)
                    .put("c07", c07)
                    .put("c08", c08);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public String sDtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("d1", d1)
                    .put("d02", d02)
                    .put("d03", d03)
                    .put("d04", d04)
                    .put("d05", d05);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public String sEtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("e01", e01)
                    .put("e02", e02)
                    .put("e0201", e0201)
                    .put("e0202", e0202)
                    .put("e0301", e0301)
                    .put("e0302", e0302)
                    .put("e0303", e0303)
                    .put("e0304", e0304)
                    .put("e0305", e0305)
                    .put("e0306", e0306)
                    .put("e03096", e03096)
                    .put("e04", e04)
                    .put("e05", e05)
                    .put("e06", e06)
                    .put("e07", e07)
                    .put("e0801", e0801)
                    .put("e0802", e0802)
                    .put("e0803", e0803)
                    .put("e0804", e0804)
                    .put("e0805", e0805)
                    .put("e0806", e0806)
                    .put("e08096", e08096)
                    .put("e09", e09)
                    .put("e10", e10)
                    .put("e1101", e1101)
                    .put("e1102", e1102)
                    .put("e1103", e1103)
                    .put("e1104", e1104)
                    .put("e1105", e1105)
                    .put("e1106", e1106)
                    .put("e12", e12)
                    .put("e13", e13)
                    .put("e1401", e1401)
                    .put("e1402", e1402)
                    .put("e15", e15);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public String sFtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("f01", f01)
                    .put("f02", f02)
                    .put("f03", f03)
                    .put("f04", f04)
                    .put("f05", f05)
                    .put("f06", f06)
                    .put("f07", f07)
                    .put("f08", f08)
                    .put("f09dd", f09dd)
                    .put("f09mm", f09mm)
                    .put("f09yy", f09yy)
                    .put("f10", f10)
                    .put("f11dd", f11dd)
                    .put("f11mm", f11mm)
                    .put("f11yy", f11yy)
                    .put("f12", f12)
                    .put("f13", f13)

                    .put("f14", f14)
                    .put("f15", f15)
                    .put("f16", f16)
                    .put("f17", f17);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public String sGtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("g01", g01)
                    .put("g02", g02)
                    .put("g03", g03)
                    .put("g04", g04)
                    .put("g04096x", g04096x)
                    .put("g0501", g0501)
                    .put("g0502", g0502)
                    .put("g0503", g0503)
                    .put("g0504", g0504)
                    .put("g0505", g0505)
                    .put("g0506", g0506)
                    .put("g0507", g0507)
                    .put("g0508", g0508)
                    .put("g0509", g0509)
                    .put("g0510", g0510)
                    .put("g0511", g0511)
                    .put("g0512", g0512)
                    .put("g0513", g0513)
                    .put("g06", g06)
                    .put("g0701", g0701)
                    .put("g0702", g0702)
                    .put("g0703", g0703)
                    .put("g0704", g0704)
                    .put("g0705", g0705)
                    .put("g0706", g0706)
                    .put("g0707", g0707)
                    .put("g0501", g0501)
                    .put("g0802", g0802)
                    .put("g0803", g0803)
                    .put("g0804", g0804)
                    .put("g0805", g0805)
                    .put("g0806", g0806)
                    .put("g0807", g0807)
                    .put("g0808", g0808)
                    .put("g0809", g0809)
                    .put("g08096", g08096)
                    .put("g09", g09)
                    .put("g10", g10)
                    .put("g11", g11)
                    .put("g12", g12)
                    .put("g12096x", g12096x)
                    .put("g13", g13)
                    .put("g13096x", g13096x);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public String sHtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("h01a", h01a)
                    .put("h01dd", h01dd)
                    .put("h01mm", h01mm)
                    .put("h01yy", h01yy)
                    .put("h02dd", h02dd)
                    .put("h02mm", h02mm)
                    .put("h02yy", h02yy)
                    .put("h0301", h0301)
                    .put("h0302", h0302)
                    .put("h0303", h0303)
                    .put("h0304", h0304)
                    .put("h0305", h0305)
                    .put("h0306", h0306)
                    .put("h0307", h0307)
                    .put("h0308", h0308)
                    .put("h0309", h0309)
                    .put("h0310", h0310)
                    .put("h0311", h0311)
                    .put("h0312", h0312)
                    .put("h0313", h0313)
                    .put("h0314", h0314)
                    .put("h0315", h0315)
                    .put("h0316", h0316)
                    .put("h03096", h03096)
                    .put("h03096x", h03096x)
                    .put("h04", h04)
                    .put("h05", h05)
                    .put("h06", h06)
                    .put("h0701", h0701)
                    .put("h0702", h0702)
                    .put("h0801", h0801)
                    .put("h0802", h0802)
                    .put("h0803", h0803)
                    .put("h0804", h0804)
                    .put("h08096", h08096)
                    .put("h08096x", h08096x)
                    .put("h09", h09)
                    .put("h10", h10)
                    .put("h11", h11)
                    .put("h11096x", h11096x)
                    .put("h12dd", h12dd)
                    .put("h12mm", h12mm)
                    .put("h12yy", h12yy)
                    .put("h13", h13)
                    .put("h13096x", h13096x)
                    .put("h14", h14)
                    .put("h14096x", h14096x)
                    .put("h15", h15)
                    .put("h16", h16)
                    .put("h17", h17)
                    .put("h1801", h1801)
                    .put("h1802", h1802);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public String sItoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("i01", i01)
                    .put("i02", i02)
                    .put("i03", i03)
                    .put("i0401", i0401)
                    .put("i0402", i0402)
                    .put("i0403", i0403)
                    .put("i0404", i0404)
                    .put("i0405", i0405)
                    .put("i0406", i0406)
                    .put("i0407", i0407)
                    .put("i04096", i04096)
                    .put("i04096x", i04096x)
                    .put("i05", i05)
                    .put("i06", i06)
                    .put("i07", i07);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public String sJtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("j01", j01)
                    .put("j02", j02)
                    .put("j03", j03)
                    .put("j04", j04)
                    .put("j05", j05)
                    .put("j06", j06)
                    .put("j07", j07)
                    .put("j0801", j0801)
                    .put("j0802", j0802)
                    .put("j0803", j0803)
                    .put("j0804", j0804)
                    .put("j0805", j0805)
                    .put("j0806", j0806)
                    .put("j08096", j08096)
                    .put("j08096x", j08096x)
                    .put("j09", j09)
                    .put("j09096x", j09096x)
                    .put("j010", j010)
                    .put("j011", j011)
                    .put("j012", j012);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public String sKtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("k01", k01)
                    .put("k02", k02)
                    .put("k03", k03)
                    .put("k04", k04)
                    .put("k05", k05)
                    .put("k05096x", k05096x)
                    .put("k06", k06)
                    .put("k07", k07)
                    .put("k08", k08)
                    .put("k09", k09)
                    .put("k10", k10)
                    .put("k11", k11)
                    .put("k12", k12)
                    .put("k13", k13)
                    .put("k14", k14)
                    .put("k14096x", k14096x)
                    .put("k15", k15)
                    .put("k16", k16)
                    .put("k16096x", k16096x)
                    .put("k17", k17);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public String sLtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("l01", l01)
                    .put("l02", l02)
                    .put("l02096x", l02096x)
                    .put("l03", l03)
                    .put("l04", l04)
                    .put("l05", l05)
                    .put("l06", l06)
                    .put("l07", l07)
                    .put("l08", l08)
                    .put("l09", l09)
                    .put("l010", l010)
                    .put("gpslat", gpslat)
                    .put("gpslng", gpslng)
                    .put("gpsdate", gpsdate)
                    .put("gpsacc", gpsacc)
                    .put("deviceid", deviceid)
                    .put("tagid", tagid)
                    .put("appversion", appversion);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(FormsTable.COLUMN_ID, this._ID == null ? JSONObject.NULL : this._ID);

            json.put(FormsTable.COLUMN_UID, this._UID == null ? JSONObject.NULL : this._UID);
            json.put(FormsTable.COLUMN_SYSDATE, this.sysdate == null ? JSONObject.NULL : this.sysdate);
            json.put(FormsTable.COLUMN_A01, this.a01 == null ? JSONObject.NULL : this.a01);
            json.put(FormsTable.COLUMN_A02, this.a02 == null ? JSONObject.NULL : this.a02);
            json.put(FormsTable.COLUMN_A03, this.a03 == null ? JSONObject.NULL : this.a03);
            json.put(FormsTable.COLUMN_A04, this.a04 == null ? JSONObject.NULL : this.a04);
            json.put(FormsTable.COLUMN_A05, this.a05 == null ? JSONObject.NULL : this.a05);
            json.put(FormsTable.COLUMN_REFNO, this.refno == null ? JSONObject.NULL : this.refno);
            json.put(FormsTable.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);
            json.put(FormsTable.COLUMN_ISTATUS96x, this.istatus96x == null ? JSONObject.NULL : this.istatus96x);
            json.put(FormsTable.COLUMN_ENDINGDATETIME, this.endingdatetime == null ? JSONObject.NULL : this.endingdatetime);

         /*   if (this.sInfo != null && !this.sInfo.equals("")) {
                json.put(FormsTable.COLUMN_SINFO, new JSONObject(this.sInfo));
            }

            if (this.sB != null && !this.sB.equals("")) {
                json.put(FormsTable.COLUMN_SB, new JSONObject(this.sB));
            }

            if (this.sC != null && !this.sC.equals("")) {
                json.put(FormsTable.COLUMN_SC, new JSONObject(this.sC));
            }

            if (this.sD != null && !this.sD.equals("")) {
                json.put(FormsTable.COLUMN_SD, new JSONObject(this.sD));
            }

            if (this.sE != null && !this.sE.equals("")) {
                json.put(FormsTable.COLUMN_SE, new JSONObject(this.sE));
            }

            if (this.sF != null && !this.sF.equals("")) {
                json.put(FormsTable.COLUMN_SF, new JSONObject(this.sF));
            }

            if (this.sG != null && !this.sG.equals("")) {
                json.put(FormsTable.COLUMN_SG, new JSONObject(this.sG));
            }

            if (this.sH != null && !this.sH.equals("")) {
                json.put(FormsTable.COLUMN_SH, new JSONObject(this.sH));
            }

            if (this.sI != null && !this.sI.equals("")) {
                json.put(FormsTable.COLUMN_SI, new JSONObject(this.sI));
            }

            if (this.sJ != null && !this.sJ.equals("")) {
                json.put(FormsTable.COLUMN_SJ, new JSONObject(this.sJ));
            }

            if (this.sK != null && !this.sK.equals("")) {
                json.put(FormsTable.COLUMN_SK, new JSONObject(this.sK));
            }

            if (this.sL != null && !this.sL.equals("")) {
                json.put(FormsTable.COLUMN_SL, new JSONObject(this.sL));
            }*/


            json.put(FormsTable.COLUMN_SINFO, new JSONObject(sInfotoString()));
            json.put(FormsTable.COLUMN_SB, new JSONObject(sBtoString()));
            json.put(FormsTable.COLUMN_SC, new JSONObject(sCtoString()));
            json.put(FormsTable.COLUMN_SD, new JSONObject(sDtoString()));
            json.put(FormsTable.COLUMN_SE, new JSONObject(sEtoString()));
            json.put(FormsTable.COLUMN_SF, new JSONObject(sFtoString()));
            json.put(FormsTable.COLUMN_SG, new JSONObject(sGtoString()));
            json.put(FormsTable.COLUMN_SH, new JSONObject(sHtoString()));
            json.put(FormsTable.COLUMN_SI, new JSONObject(sItoString()));
            json.put(FormsTable.COLUMN_SJ, new JSONObject(sJtoString()));
            json.put(FormsTable.COLUMN_SK, new JSONObject(sKtoString()));
            json.put(FormsTable.COLUMN_SL, new JSONObject(sLtoString()));


            if (this.sC != null && !this.sC.equals("")) {
                json.put(FormsTable.COLUMN_SC, new JSONObject(this.sC));
            }

            if (this.sD != null && !this.sD.equals("")) {
                json.put(FormsTable.COLUMN_SD, new JSONObject(this.sD));
            }

            if (this.sE != null && !this.sE.equals("")) {
                json.put(FormsTable.COLUMN_SE, new JSONObject(this.sE));
            }

            if (this.sF != null && !this.sF.equals("")) {
                json.put(FormsTable.COLUMN_SF, new JSONObject(this.sF));
            }

            if (this.sG != null && !this.sG.equals("")) {
                json.put(FormsTable.COLUMN_SG, new JSONObject(this.sG));
            }

            if (this.sH != null && !this.sH.equals("")) {
                json.put(FormsTable.COLUMN_SH, new JSONObject(this.sH));
            }

            if (this.sI != null && !this.sI.equals("")) {
                json.put(FormsTable.COLUMN_SI, new JSONObject(this.sI));
            }

            if (this.sJ != null && !this.sJ.equals("")) {
                json.put(FormsTable.COLUMN_SJ, new JSONObject(this.sJ));
            }

            if (this.sK != null && !this.sK.equals("")) {
                json.put(FormsTable.COLUMN_SK, new JSONObject(this.sK));
            }

            if (this.sL != null && !this.sL.equals("")) {
                json.put(FormsTable.COLUMN_SL, new JSONObject(this.sL));
            }

            json.put(FormsTable.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
            json.put(FormsTable.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
            json.put(FormsTable.COLUMN_GPSDATE, this.gpsDT == null ? JSONObject.NULL : this.gpsDT);
            json.put(FormsTable.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
            json.put(FormsTable.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
            json.put(FormsTable.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
            json.put(FormsTable.COLUMN_APPVERSION, this.appversion == null ? JSONObject.NULL : this.appversion);

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void sInfoHydrate(String string) {


        try {
            JSONObject json = null;
            json = new JSONObject(string);

            this.a05a = json.getString("a05a");
            this.a05b = json.getString("a05b");
            this.a06 = json.getString("a06");
            this.a07 = json.getString("a07");
            this.a08 = json.getString("a08");
            this.a09 = json.getString("a09");
            this.a10 = json.getString("a10");
            this.a11 = json.getString("a11");
            this.a12 = json.getString("a12");
            this.a13dd = json.getString("a13dd");
            this.a13mm = json.getString("a13mm");
            this.a13yy = json.getString("a13yy");
            this.a14mm = json.getString("a14mm");
            this.a14yy = json.getString("a14yy");
            this.a15 = json.getString("a15");
            this.a16 = json.getString("a16");
            this.a17 = json.getString("a17");
            this.a18 = json.getString("a18");
            this.a19 = json.getString("a19");
            this.a20 = json.getString("a20");
            this.a21 = json.getString("a21");
            this.a22pos = json.getString("a22pos");
            this.a22org = json.getString("a22org");
            this.a23 = json.getString("a23");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void sBHydrate(String string) {

        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.b01 = json.getString("b01");
                this.b02 = json.getString("b02");
                this.b03 = json.getString("b03");
                this.b04 = json.getString("b04");
                this.b05 = json.getString("b05");
                this.b06 = json.getString("b06");
                this.b06ax = json.getString("b06ax");
                this.b07 = json.getString("b07");
                this.b0801 = json.getString("b0801");
                this.b0802 = json.getString("b0802");
                this.b0803 = json.getString("b0803");
                this.b0804 = json.getString("b0804");
                this.b0805 = json.getString("b0805");
                this.b0806 = json.getString("b0806");
                this.b0807 = json.getString("b0807");
                this.b9 = json.getString("b9");
                this.b10 = json.getString("b10");
                this.b11 = json.getString("b11");
                this.b11096 = json.getString("b11096");
                this.b11096x = json.getString("b11096x");
                this.b11mc = json.getString("b11mc");
                this.b11ws = json.getString("b11ws");
                this.b12 = json.getString("b12");
                this.b1301 = json.getString("b1301");
                this.b1302 = json.getString("b1302");
                this.b1303 = json.getString("b1303");
                this.b1304 = json.getString("b1304");
                this.b1305 = json.getString("b1305");
                this.b1306 = json.getString("b1306");
                this.b1307 = json.getString("b1307");
                this.b1308 = json.getString("b1308");
                this.b1309 = json.getString("b1309");
                this.b13096 = json.getString("b13096");
                this.b14 = json.getString("b14");
                this.b1501 = json.getString("b1501");
                this.b1502 = json.getString("b1502");
                this.b1503 = json.getString("b1503");
                this.b1504 = json.getString("b1504");
                this.b1505 = json.getString("b1505");
                this.b15096 = json.getString("b15096");
                this.b16 = json.getString("b16");
                this.b17 = json.getString("b17");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void sCHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.c01 = json.getString("c01");
                this.c0201 = json.getString("c0201");
                this.c0202 = json.getString("c0202");
                this.c03 = json.getString("c03");
                this.c04 = json.getString("c04");
                this.c05 = json.getString("c05");
                this.c06 = json.getString("c06");
                this.c07 = json.getString("c07");
                this.c08 = json.getString("c08");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    private void sDHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.d1 = json.getString("d1");
                this.d02 = json.getString("d02");
                this.d03 = json.getString("d03");
                this.d04 = json.getString("d04");
                this.d05 = json.getString("d05");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void sEHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.e01 = json.getString("e01");
                this.e02 = json.getString("e02");
                this.e0201 = json.getString("e0201");
                this.e0202 = json.getString("e0202");
                this.e0301 = json.getString("e0301");
                this.e0302 = json.getString("e0302");
                this.e0303 = json.getString("e0303");
                this.e0304 = json.getString("e0304");
                this.e0305 = json.getString("e0305");
                this.e0306 = json.getString("e0306");
                this.e03096 = json.getString("e03096");
                this.e04 = json.getString("e04");
                this.e05 = json.getString("e05");
                this.e06 = json.getString("e06");
                this.e07 = json.getString("e07");
                this.e0801 = json.getString("e0801");
                this.e0802 = json.getString("e0802");
                this.e0803 = json.getString("e0803");
                this.e0804 = json.getString("e0804");
                this.e0805 = json.getString("e0805");
                this.e0806 = json.getString("e0806");
                this.e08096 = json.getString("e08096");
                this.e09 = json.getString("e09");
                this.e10 = json.getString("e10");
                this.e1101 = json.getString("e1101");
                this.e1102 = json.getString("e1102");
                this.e1103 = json.getString("e1103");
                this.e1104 = json.getString("e1104");
                this.e1105 = json.getString("e1105");
                this.e1106 = json.getString("e1106");
                this.e12 = json.getString("e12");
                this.e13 = json.getString("e13");
                this.e1401 = json.getString("e1401");
                this.e1402 = json.getString("e1402");
                this.e15 = json.getString("e15");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    private void sFHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.f01 = json.getString("f01");
                this.f02 = json.getString("f02");
                this.f03 = json.getString("f03");
                this.f04 = json.getString("f04");
                this.f05 = json.getString("f05");
                this.f06 = json.getString("f06");
                this.f07 = json.getString("f07");
                this.f08 = json.getString("f08");
                this.f09dd = json.getString("f09dd");
                this.f09mm = json.getString("f09mm");
                this.f09yy = json.getString("f09yy");
                this.f10 = json.getString("f10");
                this.f11dd = json.getString("f11dd");
                this.f11mm = json.getString("f11mm");
                this.f11yy = json.getString("f11yy");
                this.f12 = json.getString("f12");
                this.f13 = json.getString("f13");
                this.f14 = json.getString("f14");
                this.f15 = json.getString("f15");
                this.f16 = json.getString("f16");
                this.f17 = json.getString("f17");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void sGHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.g01 = json.getString("g01");
                this.g02 = json.getString("g02");
                this.g03 = json.getString("g03");
                this.g04 = json.getString("g04");
                this.g04096x = json.getString("g04096x");
                this.g0501 = json.getString("g0501");
                this.g0502 = json.getString("g0502");
                this.g0503 = json.getString("g0503");
                this.g0504 = json.getString("g0504");
                this.g0505 = json.getString("g0505");
                this.g0506 = json.getString("g0506");
                this.g0507 = json.getString("g0507");
                this.g0508 = json.getString("g0508");
                this.g0509 = json.getString("g0509");
                this.g0510 = json.getString("g0510");
                this.g0511 = json.getString("g0511");
                this.g0512 = json.getString("g0512");
                this.g0513 = json.getString("g0513");
                this.g06 = json.getString("g06");
                this.g0701 = json.getString("g0701");
                this.g0702 = json.getString("g0702");
                this.g0703 = json.getString("g0703");
                this.g0704 = json.getString("g0704");
                this.g0705 = json.getString("g0705");
                this.g0706 = json.getString("g0706");
                this.g0707 = json.getString("g0707");
                this.g0801 = json.getString("g0801");
                this.g0802 = json.getString("g0802");
                this.g0803 = json.getString("g0803");
                this.g0804 = json.getString("g0804");
                this.g0805 = json.getString("g0805");
                this.g0806 = json.getString("g0806");
                this.g0807 = json.getString("g0807");
                this.g0808 = json.getString("g0808");
                this.g0809 = json.getString("g0809");
                this.g08096 = json.getString("g08096");
                this.g09 = json.getString("g09");
                this.g10 = json.getString("g10");
                this.g11 = json.getString("g11");
                this.g12 = json.getString("g12");
                this.g12096x = json.getString("g12096x");
                this.g13 = json.getString("g13");
                this.g13096x = json.getString("g13096x");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void sHHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.h01a = json.getString("h01a");
                this.h01dd = json.getString("h01dd");
                this.h01mm = json.getString("h01mm");
                this.h01yy = json.getString("h01yy");
                this.h02dd = json.getString("h02dd");
                this.h02mm = json.getString("h02mm");
                this.h02yy = json.getString("h02yy");
                this.h0301 = json.getString("h0301");
                this.h0302 = json.getString("h0302");
                this.h0303 = json.getString("h0303");
                this.h0304 = json.getString("h0304");
                this.h0305 = json.getString("h0305");
                this.h0306 = json.getString("h0306");
                this.h0307 = json.getString("h0307");
                this.h0308 = json.getString("h0308");
                this.h0309 = json.getString("h0309");
                this.h0310 = json.getString("h0310");
                this.h0311 = json.getString("h0311");
                this.h0312 = json.getString("h0312");
                this.h0313 = json.getString("h0313");
                this.h0314 = json.getString("h0314");
                this.h0315 = json.getString("h0315");
                this.h0316 = json.getString("h0316");
                this.h03096 = json.getString("h03096");
                this.h03096x = json.getString("h03096x");
                this.h04 = json.getString("h04");
                this.h05 = json.getString("h05");
                this.h06 = json.getString("h06");
                this.h0701 = json.getString("h0701");
                this.h0702 = json.getString("h0702");
                this.h0801 = json.getString("h0801");
                this.h0802 = json.getString("h0802");
                this.h0803 = json.getString("h0803");
                this.h0804 = json.getString("h0804");
                this.h08096 = json.getString("h08096");
                this.h08096x = json.getString("h08096x");
                this.h09 = json.getString("h09");
                this.h10 = json.getString("h10");
                this.h11 = json.getString("h11");
                this.h11096x = json.getString("h11096x");
                this.h12dd = json.getString("h12dd");
                this.h12mm = json.getString("h12mm");
                this.h12yy = json.getString("h12yy");
                this.h13 = json.getString("h13");
                this.h13096x = json.getString("h13096x");
                this.h14 = json.getString("h14");
                this.h14096x = json.getString("h14096x");
                this.h15 = json.getString("h15");
                this.h16 = json.getString("h16");
                this.h17 = json.getString("h17");
                this.h1801 = json.getString("h1801");
                this.h1802 = json.getString("h1802");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void sIHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.i01 = json.getString("i01");
                this.i02 = json.getString("i02");
                this.i03 = json.getString("i03");
                this.i0401 = json.getString("i0401");
                this.i0402 = json.getString("i0402");
                this.i0403 = json.getString("i0403");
                this.i0404 = json.getString("i0404");
                this.i0405 = json.getString("i0405");
                this.i0406 = json.getString("i0406");
                this.i0407 = json.getString("i0407");
                this.i04096 = json.getString("i04096");
                this.i04096x = json.getString("i04096x");
                this.i05 = json.getString("i05");
                this.i06 = json.getString("i06");
                this.i07 = json.getString("i07");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void sJHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.j01 = json.getString("j01");
                this.j02 = json.getString("j02");
                this.j03 = json.getString("j03");
                this.j04 = json.getString("j04");
                this.j05 = json.getString("j05");
                this.j06 = json.getString("j06");
                this.j07 = json.getString("j07");
                this.j0801 = json.getString("j0801");
                this.j0802 = json.getString("j0802");
                this.j0803 = json.getString("j0803");
                this.j0804 = json.getString("j0804");
                this.j0805 = json.getString("j0805");
                this.j0806 = json.getString("j0806");
                this.j08096 = json.getString("j08096");
                this.j08096x = json.getString("j08096x");
                this.j09 = json.getString("j09");
                this.j09096x = json.getString("j09096x");
                this.j010 = json.getString("j010");
                this.j011 = json.getString("j011");
                this.j012 = json.getString("j012");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    private void sKHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.k10 = json.getString("k10");
                this.k11 = json.getString("k11");
                this.k12 = json.getString("k12");
                this.k13 = json.getString("k13");
                this.k14 = json.getString("k14");
                this.k14096x = json.getString("k14096x");
                this.k15 = json.getString("k15");
                this.k16 = json.getString("k16");
                this.k16096x = json.getString("k16096x");
                this.k17 = json.getString("k17");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void sLHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.l01 = json.getString("l01");
                this.l02 = json.getString("l02");
                this.l02096x = json.getString("l02096x");
                this.l03 = json.getString("l03");
                this.l04 = json.getString("l04");
                this.l05 = json.getString("l05");
                this.l06 = json.getString("l06");
                this.l07 = json.getString("l07");
                this.l08 = json.getString("l08");
                this.l09 = json.getString("l09");
                this.l010 = json.getString("l010");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
