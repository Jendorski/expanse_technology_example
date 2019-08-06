package com.expanse.test.project.expanseproject.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.lifecycle.ViewModel;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "RatesModel")
public class RatesModel extends ViewModel {

    @SerializedName("AED")
    @Expose
    @ColumnInfo(name = "aED")
    private double aED;

    @SerializedName("AFN")
    @Expose
    @ColumnInfo(name = "aFN")
    private double aFN;

    @SerializedName("ALL")
    @Expose
    @ColumnInfo(name = "aLL")
    private double aLL;

    @SerializedName("AMD")
    @Expose
    @ColumnInfo(name = "aMD")
    private double aMD;

    @SerializedName("ANG")
    @Expose
    @ColumnInfo(name = "aNG")
    private double aNG;

    @SerializedName("AOA")
    @Expose
    @ColumnInfo(name = "aOA")
    private double aOA;

    @SerializedName("ARS")
    @Expose
    @ColumnInfo(name = "aRS")
    private double aRS;

    @SerializedName("AUD")
    @Expose
    @ColumnInfo(name = "aUD")
    private double aUD;

    @SerializedName("AWG")
    @Expose
    @ColumnInfo(name = "aWG")
    private double aWG;

    @SerializedName("AZN")
    @Expose
    @ColumnInfo(name = "aZN")
    private double aZN;

    @SerializedName("BAM")
    @Expose
    @ColumnInfo(name = "bAM")
    private double bAM;

    @SerializedName("BBD")
    @Expose
    @ColumnInfo(name = "bBD")
    private double bBD;

    @SerializedName("BDT")
    @Expose
    @ColumnInfo(name = "bDT")
    private double bDT;

    @SerializedName("BGN")
    @Expose
    @ColumnInfo(name = "bGN")
    private double bGN;

    @SerializedName("BHD")
    @Expose
    @ColumnInfo(name = "bHD")
    private double bHD;

    @SerializedName("BIF")
    @Expose
    @ColumnInfo(name = "bIF")
    private double bIF;

    @SerializedName("BMD")
    @Expose
    @ColumnInfo(name = "bMD")
    private double bMD;

    @SerializedName("BND")
    @Expose
    @ColumnInfo(name = "bND")
    private double bND;

    @SerializedName("BOB")
    @Expose
    @ColumnInfo(name = "bOB")
    private double bOB;

    @SerializedName("BRL")
    @Expose
    @ColumnInfo(name = "bRL")
    private double bRL;

    @SerializedName("BSD")
    @Expose
    @ColumnInfo(name = "bSD")
    private double bSD;

    @SerializedName("BTC")
    @Expose
    @ColumnInfo(name = "bTC")
    private double bTC;

    @SerializedName("BTN")
    @Expose
    @ColumnInfo(name = "bTN")
    private double bTN;

    @SerializedName("BWP")
    @Expose
    @ColumnInfo(name = "bWP")
    private double bWP;

    @SerializedName("BYN")
    @Expose
    @ColumnInfo(name = "bYN")
    private double bYN;

    @SerializedName("BYR")
    @Expose
    @ColumnInfo(name = "bYR")
    private double bYR;

    @SerializedName("BZD")
    @Expose
    @ColumnInfo(name = "bZD")
    private double bZD;

    @SerializedName("CAD")
    @Expose
    @ColumnInfo(name = "cAD")
    private double cAD;

    @SerializedName("CDF")
    @Expose
    @ColumnInfo(name = "cDF")
    private double cDF;

    @SerializedName("CHF")
    @Expose
    @ColumnInfo(name = "cHF")
    private double cHF;

    @SerializedName("CLF")
    @Expose
    @ColumnInfo(name = "cLF")
    private double cLF;

    @SerializedName("CLP")
    @Expose
    @ColumnInfo(name = "cLP")
    private double cLP;

    @SerializedName("CNY")
    @Expose
    private double cNY;

    @SerializedName("COP")
    @Expose
    private double cOP;

    @SerializedName("CRC")
    @Expose
    private double cRC;

    @SerializedName("CUC")
    @Expose
    private double cUC;

    @SerializedName("CUP")
    @Expose
    private double cUP;

    @SerializedName("CVE")
    @Expose
    private double cVE;

    @SerializedName("CZK")
    @Expose
    private double cZK;

    @SerializedName("DJF")
    @Expose
    private double dJF;

    @SerializedName("DKK")
    @Expose
    private double dKK;

    @SerializedName("DOP")
    @Expose
    private double dOP;

    @SerializedName("DZD")
    @Expose
    private double dZD;

    @SerializedName("EGP")
    @Expose
    private double eGP;

    @SerializedName("ERN")
    @Expose
    private double eRN;

    @SerializedName("ETB")
    @Expose
    private double eTB;

    @SerializedName("EUR")
    @Expose
    private long eUR;

    @SerializedName("FJD")
    @Expose
    private double fJD;

    @SerializedName("FKP")
    @Expose
    private double fKP;

    @SerializedName("GBP")
    @Expose
    private double gBP;

    @SerializedName("GEL")
    @Expose
    private double gEL;

    @SerializedName("GGP")
    @Expose
    private double gGP;

    @SerializedName("GHS")
    @Expose
    private double gHS;

    @SerializedName("GIP")
    @Expose
    private double gIP;

    @SerializedName("GMD")
    @Expose
    private double gMD;

    @SerializedName("GNF")
    @Expose
    private double gNF;

    @SerializedName("GTQ")
    @Expose
    private double gTQ;

    @SerializedName("GYD")
    @Expose
    private double gYD;

    @SerializedName("HKD")
    @Expose
    private double hKD;

    @SerializedName("HNL")
    @Expose
    private double hNL;

    @SerializedName("HRK")
    @Expose
    private double hRK;

    @SerializedName("HTG")
    @Expose
    private double hTG;

    @SerializedName("HUF")
    @Expose
    private double hUF;

    @SerializedName("IDR")
    @Expose
    private double iDR;

    @SerializedName("ILS")
    @Expose
    private double iLS;

    @SerializedName("IMP")
    @Expose
    private double iMP;

    @SerializedName("INR")
    @Expose
    private double iNR;

    @SerializedName("IQD")
    @Expose
    private double iQD;

    @SerializedName("IRR")
    @Expose
    private double iRR;

    @SerializedName("ISK")
    @Expose
    private double iSK;

    @SerializedName("JEP")
    @Expose
    private double jEP;

    @SerializedName("JMD")
    @Expose
    private double jMD;

    @SerializedName("JOD")
    @Expose
    private double jOD;

    @SerializedName("JPY")
    @Expose
    private double jPY;

    @SerializedName("KES")
    @Expose
    private double kES;

    @SerializedName("KGS")
    @Expose
    private double kGS;

    @SerializedName("KHR")
    @Expose
    private double kHR;

    @SerializedName("KMF")
    @Expose
    private double kMF;

    @SerializedName("KPW")
    @Expose
    private double kPW;

    @SerializedName("KRW")
    @Expose
    private double kRW;

    @SerializedName("KWD")
    @Expose
    private double kWD;

    @SerializedName("KYD")
    @Expose
    private double kYD;

    @SerializedName("KZT")
    @Expose
    private double kZT;

    @SerializedName("LAK")
    @Expose
    private double lAK;

    @SerializedName("LBP")
    @Expose
    private double lBP;

    @SerializedName("LKR")
    @Expose
    private double lKR;

    @SerializedName("LRD")
    @Expose
    private double lRD;

    @SerializedName("LSL")
    @Expose
    private double lSL;

    @SerializedName("LTL")
    @Expose
    private double lTL;

    @SerializedName("LVL")
    @Expose
    private double lVL;

    @SerializedName("LYD")
    @Expose
    private double lYD;

    @SerializedName("MAD")
    @Expose
    private double mAD;

    @SerializedName("MDL")
    @Expose
    private double mDL;

    @SerializedName("MGA")
    @Expose
    private double mGA;

    @SerializedName("MKD")
    @Expose
    private double mKD;

    @SerializedName("MMK")
    @Expose
    private double mMK;

    @SerializedName("MNT")
    @Expose
    private double mNT;

    @SerializedName("MOP")
    @Expose
    private double mOP;

    @SerializedName("MRO")
    @Expose
    private double mRO;

    @SerializedName("MUR")
    @Expose
    private double mUR;

    @SerializedName("MVR")
    @Expose
    private double mVR;

    @SerializedName("MWK")
    @Expose
    private double mWK;

    @SerializedName("MXN")
    @Expose
    private double mXN;

    @SerializedName("MYR")
    @Expose
    private double mYR;

    @SerializedName("MZN")
    @Expose
    private double mZN;

    @SerializedName("NAD")
    @Expose
    private double nAD;

    @SerializedName("NGN")
    @Expose
    private double nGN;

    @SerializedName("NIO")
    @Expose
    private double nIO;

    @SerializedName("NOK")
    @Expose
    private double nOK;

    @SerializedName("NPR")
    @Expose
    private double nPR;

    @SerializedName("NZD")
    @Expose
    private double nZD;

    @SerializedName("OMR")
    @Expose
    private double oMR;

    @SerializedName("PAB")
    @Expose
    private double pAB;

    @SerializedName("PEN")
    @Expose
    private double pEN;

    @SerializedName("PGK")
    @Expose
    private double pGK;

    @SerializedName("PHP")
    @Expose
    private double pHP;

    @SerializedName("PKR")
    @Expose
    private double pKR;

    @SerializedName("PLN")
    @Expose
    private double pLN;

    @SerializedName("PYG")
    @Expose
    private double pYG;

    @SerializedName("QAR")
    @Expose
    private double qAR;

    @SerializedName("RON")
    @Expose
    private double rON;

    @SerializedName("RSD")
    @Expose
    private double rSD;

    @SerializedName("RUB")
    @Expose
    private double rUB;

    @SerializedName("RWF")
    @Expose
    private double rWF;

    @SerializedName("SAR")
    @Expose
    private double sAR;

    @SerializedName("SBD")
    @Expose
    private double sBD;

    @SerializedName("SCR")
    @Expose
    private double sCR;

    @SerializedName("SDG")
    @Expose
    private double sDG;

    @SerializedName("SEK")
    @Expose
    private double sEK;

    @SerializedName("SGD")
    @Expose
    private double sGD;

    @SerializedName("SHP")
    @Expose
    private double sHP;

    @SerializedName("SLL")
    @Expose
    private double sLL;

    @SerializedName("SOS")
    @Expose
    private double sOS;

    @SerializedName("SRD")
    @Expose
    private double sRD;

    @SerializedName("STD")
    @Expose
    private double sTD;

    @SerializedName("SVC")
    @Expose
    private double sVC;

    @SerializedName("SYP")
    @Expose
    private double sYP;

    @SerializedName("SZL")
    @Expose
    private double sZL;

    @SerializedName("THB")
    @Expose
    private double tHB;

    @SerializedName("TJS")
    @Expose
    private double tJS;

    @SerializedName("TMT")
    @Expose
    private double tMT;

    @SerializedName("TND")
    @Expose
    private double tND;

    @SerializedName("TOP")
    @Expose
    private double tOP;

    @SerializedName("TRY")
    @Expose
    private double tRY;

    @SerializedName("TTD")
    @Expose
    private double tTD;

    @SerializedName("TWD")
    @Expose
    private double tWD;

    @SerializedName("TZS")
    @Expose
    private double tZS;

    @SerializedName("UAH")
    @Expose
    private double uAH;

    @SerializedName("UGX")
    @Expose
    private double uGX;

    @SerializedName("USD")
    @Expose
    @PrimaryKey
    @ColumnInfo(name = "uSD")
    private double uSD;

    @SerializedName("UYU")
    @Expose
    private double uYU;

    @SerializedName("UZS")
    @Expose
    private double uZS;

    @SerializedName("VEF")
    @Expose
    private double vEF;

    @SerializedName("VND")
    @Expose
    private double vND;

    @SerializedName("VUV")
    @Expose
    private double vUV;

    @SerializedName("WST")
    @Expose
    private double wST;

    @SerializedName("XAF")
    @Expose
    private double xAF;

    @SerializedName("XAG")
    @Expose
    private double xAG;

    @SerializedName("XAU")
    @Expose
    private double xAU;

    @SerializedName("XCD")
    @Expose
    private double xCD;

    @SerializedName("XDR")
    @Expose
    private double xDR;

    @SerializedName("XOF")
    @Expose
    private double xOF;

    @SerializedName("XPF")
    @Expose
    private double xPF;

    @SerializedName("YER")
    @Expose
    private double yER;

    @SerializedName("ZAR")
    @Expose
    private double zAR;

    @SerializedName("ZMK")
    @Expose
    private double zMK;

    @SerializedName("ZMW")
    @Expose
    private double zMW;

    @SerializedName("ZWL")
    @Expose
    private double zWL;

    public final static Parcelable.Creator<RatesModel> CREATOR = new Parcelable.Creator<RatesModel>() {

        @SuppressWarnings({"unchecked"})
        public RatesModel createFromParcel(Parcel in) {
            return new RatesModel(in);
        }

        public RatesModel[] newArray(int size) {
            return (new RatesModel[size]);
        }

    };

    private final static long serialVersionUID = 5922741341210331708L;

    protected RatesModel(Parcel in) {
        this.aED = ((double) in.readValue((double.class.getClassLoader())));
        this.aFN = ((double) in.readValue((double.class.getClassLoader())));
        this.aLL = ((double) in.readValue((double.class.getClassLoader())));
        this.aMD = ((double) in.readValue((double.class.getClassLoader())));
        this.aNG = ((double) in.readValue((double.class.getClassLoader())));
        this.aOA = ((double) in.readValue((double.class.getClassLoader())));
        this.aRS = ((double) in.readValue((double.class.getClassLoader())));
        this.aUD = ((double) in.readValue((double.class.getClassLoader())));
        this.aWG = ((double) in.readValue((double.class.getClassLoader())));
        this.aZN = ((double) in.readValue((double.class.getClassLoader())));
        this.bAM = ((double) in.readValue((double.class.getClassLoader())));
        this.bBD = ((double) in.readValue((double.class.getClassLoader())));
        this.bDT = ((double) in.readValue((double.class.getClassLoader())));
        this.bGN = ((double) in.readValue((double.class.getClassLoader())));
        this.bHD = ((double) in.readValue((double.class.getClassLoader())));
        this.bIF = ((double) in.readValue((double.class.getClassLoader())));
        this.bMD = ((double) in.readValue((double.class.getClassLoader())));
        this.bND = ((double) in.readValue((double.class.getClassLoader())));
        this.bOB = ((double) in.readValue((double.class.getClassLoader())));
        this.bRL = ((double) in.readValue((double.class.getClassLoader())));
        this.bSD = ((double) in.readValue((double.class.getClassLoader())));
        this.bTC = ((double) in.readValue((double.class.getClassLoader())));
        this.bTN = ((double) in.readValue((double.class.getClassLoader())));
        this.bWP = ((double) in.readValue((double.class.getClassLoader())));
        this.bYN = ((double) in.readValue((double.class.getClassLoader())));
        this.bYR = ((double) in.readValue((double.class.getClassLoader())));
        this.bZD = ((double) in.readValue((double.class.getClassLoader())));
        this.cAD = ((double) in.readValue((double.class.getClassLoader())));
        this.cDF = ((double) in.readValue((double.class.getClassLoader())));
        this.cHF = ((double) in.readValue((double.class.getClassLoader())));
        this.cLF = ((double) in.readValue((double.class.getClassLoader())));
        this.cLP = ((double) in.readValue((double.class.getClassLoader())));
        this.cNY = ((double) in.readValue((double.class.getClassLoader())));
        this.cOP = ((double) in.readValue((double.class.getClassLoader())));
        this.cRC = ((double) in.readValue((double.class.getClassLoader())));
        this.cUC = ((double) in.readValue((double.class.getClassLoader())));
        this.cUP = ((double) in.readValue((double.class.getClassLoader())));
        this.cVE = ((double) in.readValue((double.class.getClassLoader())));
        this.cZK = ((double) in.readValue((double.class.getClassLoader())));
        this.dJF = ((double) in.readValue((double.class.getClassLoader())));
        this.dKK = ((double) in.readValue((double.class.getClassLoader())));
        this.dOP = ((double) in.readValue((double.class.getClassLoader())));
        this.dZD = ((double) in.readValue((double.class.getClassLoader())));
        this.eGP = ((double) in.readValue((double.class.getClassLoader())));
        this.eRN = ((double) in.readValue((double.class.getClassLoader())));
        this.eTB = ((double) in.readValue((double.class.getClassLoader())));
        this.eUR = ((long) in.readValue((long.class.getClassLoader())));
        this.fJD = ((double) in.readValue((double.class.getClassLoader())));
        this.fKP = ((double) in.readValue((double.class.getClassLoader())));
        this.gBP = ((double) in.readValue((double.class.getClassLoader())));
        this.gEL = ((double) in.readValue((double.class.getClassLoader())));
        this.gGP = ((double) in.readValue((double.class.getClassLoader())));
        this.gHS = ((double) in.readValue((double.class.getClassLoader())));
        this.gIP = ((double) in.readValue((double.class.getClassLoader())));
        this.gMD = ((double) in.readValue((double.class.getClassLoader())));
        this.gNF = ((double) in.readValue((double.class.getClassLoader())));
        this.gTQ = ((double) in.readValue((double.class.getClassLoader())));
        this.gYD = ((double) in.readValue((double.class.getClassLoader())));
        this.hKD = ((double) in.readValue((double.class.getClassLoader())));
        this.hNL = ((double) in.readValue((double.class.getClassLoader())));
        this.hRK = ((double) in.readValue((double.class.getClassLoader())));
        this.hTG = ((double) in.readValue((double.class.getClassLoader())));
        this.hUF = ((double) in.readValue((double.class.getClassLoader())));
        this.iDR = ((double) in.readValue((double.class.getClassLoader())));
        this.iLS = ((double) in.readValue((double.class.getClassLoader())));
        this.iMP = ((double) in.readValue((double.class.getClassLoader())));
        this.iNR = ((double) in.readValue((double.class.getClassLoader())));
        this.iQD = ((double) in.readValue((double.class.getClassLoader())));
        this.iRR = ((double) in.readValue((double.class.getClassLoader())));
        this.iSK = ((double) in.readValue((double.class.getClassLoader())));
        this.jEP = ((double) in.readValue((double.class.getClassLoader())));
        this.jMD = ((double) in.readValue((double.class.getClassLoader())));
        this.jOD = ((double) in.readValue((double.class.getClassLoader())));
        this.jPY = ((double) in.readValue((double.class.getClassLoader())));
        this.kES = ((double) in.readValue((double.class.getClassLoader())));
        this.kGS = ((double) in.readValue((double.class.getClassLoader())));
        this.kHR = ((double) in.readValue((double.class.getClassLoader())));
        this.kMF = ((double) in.readValue((double.class.getClassLoader())));
        this.kPW = ((double) in.readValue((double.class.getClassLoader())));
        this.kRW = ((double) in.readValue((double.class.getClassLoader())));
        this.kWD = ((double) in.readValue((double.class.getClassLoader())));
        this.kYD = ((double) in.readValue((double.class.getClassLoader())));
        this.kZT = ((double) in.readValue((double.class.getClassLoader())));
        this.lAK = ((double) in.readValue((double.class.getClassLoader())));
        this.lBP = ((double) in.readValue((double.class.getClassLoader())));
        this.lKR = ((double) in.readValue((double.class.getClassLoader())));
        this.lRD = ((double) in.readValue((double.class.getClassLoader())));
        this.lSL = ((double) in.readValue((double.class.getClassLoader())));
        this.lTL = ((double) in.readValue((double.class.getClassLoader())));
        this.lVL = ((double) in.readValue((double.class.getClassLoader())));
        this.lYD = ((double) in.readValue((double.class.getClassLoader())));
        this.mAD = ((double) in.readValue((double.class.getClassLoader())));
        this.mDL = ((double) in.readValue((double.class.getClassLoader())));
        this.mGA = ((double) in.readValue((double.class.getClassLoader())));
        this.mKD = ((double) in.readValue((double.class.getClassLoader())));
        this.mMK = ((double) in.readValue((double.class.getClassLoader())));
        this.mNT = ((double) in.readValue((double.class.getClassLoader())));
        this.mOP = ((double) in.readValue((double.class.getClassLoader())));
        this.mRO = ((double) in.readValue((double.class.getClassLoader())));
        this.mUR = ((double) in.readValue((double.class.getClassLoader())));
        this.mVR = ((double) in.readValue((double.class.getClassLoader())));
        this.mWK = ((double) in.readValue((double.class.getClassLoader())));
        this.mXN = ((double) in.readValue((double.class.getClassLoader())));
        this.mYR = ((double) in.readValue((double.class.getClassLoader())));
        this.mZN = ((double) in.readValue((double.class.getClassLoader())));
        this.nAD = ((double) in.readValue((double.class.getClassLoader())));
        this.nGN = ((double) in.readValue((double.class.getClassLoader())));
        this.nIO = ((double) in.readValue((double.class.getClassLoader())));
        this.nOK = ((double) in.readValue((double.class.getClassLoader())));
        this.nPR = ((double) in.readValue((double.class.getClassLoader())));
        this.nZD = ((double) in.readValue((double.class.getClassLoader())));
        this.oMR = ((double) in.readValue((double.class.getClassLoader())));
        this.pAB = ((double) in.readValue((double.class.getClassLoader())));
        this.pEN = ((double) in.readValue((double.class.getClassLoader())));
        this.pGK = ((double) in.readValue((double.class.getClassLoader())));
        this.pHP = ((double) in.readValue((double.class.getClassLoader())));
        this.pKR = ((double) in.readValue((double.class.getClassLoader())));
        this.pLN = ((double) in.readValue((double.class.getClassLoader())));
        this.pYG = ((double) in.readValue((double.class.getClassLoader())));
        this.qAR = ((double) in.readValue((double.class.getClassLoader())));
        this.rON = ((double) in.readValue((double.class.getClassLoader())));
        this.rSD = ((double) in.readValue((double.class.getClassLoader())));
        this.rUB = ((double) in.readValue((double.class.getClassLoader())));
        this.rWF = ((double) in.readValue((double.class.getClassLoader())));
        this.sAR = ((double) in.readValue((double.class.getClassLoader())));
        this.sBD = ((double) in.readValue((double.class.getClassLoader())));
        this.sCR = ((double) in.readValue((double.class.getClassLoader())));
        this.sDG = ((double) in.readValue((double.class.getClassLoader())));
        this.sEK = ((double) in.readValue((double.class.getClassLoader())));
        this.sGD = ((double) in.readValue((double.class.getClassLoader())));
        this.sHP = ((double) in.readValue((double.class.getClassLoader())));
        this.sLL = ((double) in.readValue((double.class.getClassLoader())));
        this.sOS = ((double) in.readValue((double.class.getClassLoader())));
        this.sRD = ((double) in.readValue((double.class.getClassLoader())));
        this.sTD = ((double) in.readValue((double.class.getClassLoader())));
        this.sVC = ((double) in.readValue((double.class.getClassLoader())));
        this.sYP = ((double) in.readValue((double.class.getClassLoader())));
        this.sZL = ((double) in.readValue((double.class.getClassLoader())));
        this.tHB = ((double) in.readValue((double.class.getClassLoader())));
        this.tJS = ((double) in.readValue((double.class.getClassLoader())));
        this.tMT = ((double) in.readValue((double.class.getClassLoader())));
        this.tND = ((double) in.readValue((double.class.getClassLoader())));
        this.tOP = ((double) in.readValue((double.class.getClassLoader())));
        this.tRY = ((double) in.readValue((double.class.getClassLoader())));
        this.tTD = ((double) in.readValue((double.class.getClassLoader())));
        this.tWD = ((double) in.readValue((double.class.getClassLoader())));
        this.tZS = ((double) in.readValue((double.class.getClassLoader())));
        this.uAH = ((double) in.readValue((double.class.getClassLoader())));
        this.uGX = ((double) in.readValue((double.class.getClassLoader())));
        this.uSD = ((double) in.readValue((double.class.getClassLoader())));
        this.uYU = ((double) in.readValue((double.class.getClassLoader())));
        this.uZS = ((double) in.readValue((double.class.getClassLoader())));
        this.vEF = ((double) in.readValue((double.class.getClassLoader())));
        this.vND = ((double) in.readValue((double.class.getClassLoader())));
        this.vUV = ((double) in.readValue((double.class.getClassLoader())));
        this.wST = ((double) in.readValue((double.class.getClassLoader())));
        this.xAF = ((double) in.readValue((double.class.getClassLoader())));
        this.xAG = ((double) in.readValue((double.class.getClassLoader())));
        this.xAU = ((double) in.readValue((double.class.getClassLoader())));
        this.xCD = ((double) in.readValue((double.class.getClassLoader())));
        this.xDR = ((double) in.readValue((double.class.getClassLoader())));
        this.xOF = ((double) in.readValue((double.class.getClassLoader())));
        this.xPF = ((double) in.readValue((double.class.getClassLoader())));
        this.yER = ((double) in.readValue((double.class.getClassLoader())));
        this.zAR = ((double) in.readValue((double.class.getClassLoader())));
        this.zMK = ((double) in.readValue((double.class.getClassLoader())));
        this.zMW = ((double) in.readValue((double.class.getClassLoader())));
        this.zWL = ((double) in.readValue((double.class.getClassLoader())));
    }

    public RatesModel() {
    }

    public double getAED() {
        return aED;
    }

    public void setAED(double aED) {
        this.aED = aED;
    }

    public double getAFN() {
        return aFN;
    }

    public void setAFN(double aFN) {
        this.aFN = aFN;
    }

    public double getALL() {
        return aLL;
    }

    public void setALL(double aLL) {
        this.aLL = aLL;
    }

    public double getAMD() {
        return aMD;
    }

    public void setAMD(double aMD) {
        this.aMD = aMD;
    }

    public double getANG() {
        return aNG;
    }

    public void setANG(double aNG) {
        this.aNG = aNG;
    }

    public double getAOA() {
        return aOA;
    }

    public void setAOA(double aOA) {
        this.aOA = aOA;
    }

    public double getARS() {
        return aRS;
    }

    public void setARS(double aRS) {
        this.aRS = aRS;
    }

    public double getAUD() {
        return aUD;
    }

    public void setAUD(double aUD) {
        this.aUD = aUD;
    }

    public double getAWG() {
        return aWG;
    }

    public void setAWG(double aWG) {
        this.aWG = aWG;
    }

    public double getAZN() {
        return aZN;
    }

    public void setAZN(double aZN) {
        this.aZN = aZN;
    }

    public double getBAM() {
        return bAM;
    }

    public void setBAM(double bAM) {
        this.bAM = bAM;
    }

    public double getBBD() {
        return bBD;
    }

    public void setBBD(double bBD) {
        this.bBD = bBD;
    }

    public double getBDT() {
        return bDT;
    }

    public void setBDT(double bDT) {
        this.bDT = bDT;
    }

    public double getBGN() {
        return bGN;
    }

    public void setBGN(double bGN) {
        this.bGN = bGN;
    }

    public double getBHD() {
        return bHD;
    }

    public void setBHD(double bHD) {
        this.bHD = bHD;
    }

    public double getBIF() {
        return bIF;
    }

    public void setBIF(double bIF) {
        this.bIF = bIF;
    }

    public double getBMD() {
        return bMD;
    }

    public void setBMD(double bMD) {
        this.bMD = bMD;
    }

    public double getBND() {
        return bND;
    }

    public void setBND(double bND) {
        this.bND = bND;
    }

    public double getBOB() {
        return bOB;
    }

    public void setBOB(double bOB) {
        this.bOB = bOB;
    }

    public double getBRL() {
        return bRL;
    }

    public void setBRL(double bRL) {
        this.bRL = bRL;
    }

    public double getBSD() {
        return bSD;
    }

    public void setBSD(double bSD) {
        this.bSD = bSD;
    }

    public double getBTC() {
        return bTC;
    }

    public void setBTC(double bTC) {
        this.bTC = bTC;
    }

    public double getBTN() {
        return bTN;
    }

    public void setBTN(double bTN) {
        this.bTN = bTN;
    }

    public double getBWP() {
        return bWP;
    }

    public void setBWP(double bWP) {
        this.bWP = bWP;
    }

    public double getBYN() {
        return bYN;
    }

    public void setBYN(double bYN) {
        this.bYN = bYN;
    }

    public double getBYR() {
        return bYR;
    }

    public void setBYR(double bYR) {
        this.bYR = bYR;
    }

    public double getBZD() {
        return bZD;
    }

    public void setBZD(double bZD) {
        this.bZD = bZD;
    }

    public double getCAD() {
        return cAD;
    }

    public void setCAD(double cAD) {
        this.cAD = cAD;
    }

    public double getCDF() {
        return cDF;
    }

    public void setCDF(double cDF) {
        this.cDF = cDF;
    }

    public double getCHF() {
        return cHF;
    }

    public void setCHF(double cHF) {
        this.cHF = cHF;
    }

    public double getCLF() {
        return cLF;
    }

    public void setCLF(double cLF) {
        this.cLF = cLF;
    }

    public double getCLP() {
        return cLP;
    }

    public void setCLP(double cLP) {
        this.cLP = cLP;
    }

    public double getCNY() {
        return cNY;
    }

    public void setCNY(double cNY) {
        this.cNY = cNY;
    }

    public double getCOP() {
        return cOP;
    }

    public void setCOP(double cOP) {
        this.cOP = cOP;
    }

    public double getCRC() {
        return cRC;
    }

    public void setCRC(double cRC) {
        this.cRC = cRC;
    }

    public double getCUC() {
        return cUC;
    }

    public void setCUC(double cUC) {
        this.cUC = cUC;
    }

    public double getCUP() {
        return cUP;
    }

    public void setCUP(double cUP) {
        this.cUP = cUP;
    }

    public double getCVE() {
        return cVE;
    }

    public void setCVE(double cVE) {
        this.cVE = cVE;
    }

    public double getCZK() {
        return cZK;
    }

    public void setCZK(double cZK) {
        this.cZK = cZK;
    }

    public double getDJF() {
        return dJF;
    }

    public void setDJF(double dJF) {
        this.dJF = dJF;
    }

    public double getDKK() {
        return dKK;
    }

    public void setDKK(double dKK) {
        this.dKK = dKK;
    }

    public double getDOP() {
        return dOP;
    }

    public void setDOP(double dOP) {
        this.dOP = dOP;
    }

    public double getDZD() {
        return dZD;
    }

    public void setDZD(double dZD) {
        this.dZD = dZD;
    }

    public double getEGP() {
        return eGP;
    }

    public void setEGP(double eGP) {
        this.eGP = eGP;
    }

    public double getERN() {
        return eRN;
    }

    public void setERN(double eRN) {
        this.eRN = eRN;
    }

    public double getETB() {
        return eTB;
    }

    public void setETB(double eTB) {
        this.eTB = eTB;
    }

    public long getEUR() {
        return eUR;
    }

    public void setEUR(long eUR) {
        this.eUR = eUR;
    }

    public double getFJD() {
        return fJD;
    }

    public void setFJD(double fJD) {
        this.fJD = fJD;
    }

    public double getFKP() {
        return fKP;
    }

    public void setFKP(double fKP) {
        this.fKP = fKP;
    }

    public double getGBP() {
        return gBP;
    }

    public void setGBP(double gBP) {
        this.gBP = gBP;
    }

    public double getGEL() {
        return gEL;
    }

    public void setGEL(double gEL) {
        this.gEL = gEL;
    }

    public double getGGP() {
        return gGP;
    }

    public void setGGP(double gGP) {
        this.gGP = gGP;
    }

    public double getGHS() {
        return gHS;
    }

    public void setGHS(double gHS) {
        this.gHS = gHS;
    }

    public double getGIP() {
        return gIP;
    }

    public void setGIP(double gIP) {
        this.gIP = gIP;
    }

    public double getGMD() {
        return gMD;
    }

    public void setGMD(double gMD) {
        this.gMD = gMD;
    }

    public double getGNF() {
        return gNF;
    }

    public void setGNF(double gNF) {
        this.gNF = gNF;
    }

    public double getGTQ() {
        return gTQ;
    }

    public void setGTQ(double gTQ) {
        this.gTQ = gTQ;
    }

    public double getGYD() {
        return gYD;
    }

    public void setGYD(double gYD) {
        this.gYD = gYD;
    }

    public double getHKD() {
        return hKD;
    }

    public void setHKD(double hKD) {
        this.hKD = hKD;
    }

    public double getHNL() {
        return hNL;
    }

    public void setHNL(double hNL) {
        this.hNL = hNL;
    }

    public double getHRK() {
        return hRK;
    }

    public void setHRK(double hRK) {
        this.hRK = hRK;
    }

    public double getHTG() {
        return hTG;
    }

    public void setHTG(double hTG) {
        this.hTG = hTG;
    }

    public double getHUF() {
        return hUF;
    }

    public void setHUF(double hUF) {
        this.hUF = hUF;
    }

    public double getIDR() {
        return iDR;
    }

    public void setIDR(double iDR) {
        this.iDR = iDR;
    }

    public double getILS() {
        return iLS;
    }

    public void setILS(double iLS) {
        this.iLS = iLS;
    }

    public double getIMP() {
        return iMP;
    }

    public void setIMP(double iMP) {
        this.iMP = iMP;
    }

    public double getINR() {
        return iNR;
    }

    public void setINR(double iNR) {
        this.iNR = iNR;
    }

    public double getIQD() {
        return iQD;
    }

    public void setIQD(double iQD) {
        this.iQD = iQD;
    }

    public double getIRR() {
        return iRR;
    }

    public void setIRR(double iRR) {
        this.iRR = iRR;
    }

    public double getISK() {
        return iSK;
    }

    public void setISK(double iSK) {
        this.iSK = iSK;
    }

    public double getJEP() {
        return jEP;
    }

    public void setJEP(double jEP) {
        this.jEP = jEP;
    }

    public double getJMD() {
        return jMD;
    }

    public void setJMD(double jMD) {
        this.jMD = jMD;
    }

    public double getJOD() {
        return jOD;
    }

    public void setJOD(double jOD) {
        this.jOD = jOD;
    }

    public double getJPY() {
        return jPY;
    }

    public void setJPY(double jPY) {
        this.jPY = jPY;
    }

    public double getKES() {
        return kES;
    }

    public void setKES(double kES) {
        this.kES = kES;
    }

    public double getKGS() {
        return kGS;
    }

    public void setKGS(double kGS) {
        this.kGS = kGS;
    }

    public double getKHR() {
        return kHR;
    }

    public void setKHR(double kHR) {
        this.kHR = kHR;
    }

    public double getKMF() {
        return kMF;
    }

    public void setKMF(double kMF) {
        this.kMF = kMF;
    }

    public double getKPW() {
        return kPW;
    }

    public void setKPW(double kPW) {
        this.kPW = kPW;
    }

    public double getKRW() {
        return kRW;
    }

    public void setKRW(double kRW) {
        this.kRW = kRW;
    }

    public double getKWD() {
        return kWD;
    }

    public void setKWD(double kWD) {
        this.kWD = kWD;
    }

    public double getKYD() {
        return kYD;
    }

    public void setKYD(double kYD) {
        this.kYD = kYD;
    }

    public double getKZT() {
        return kZT;
    }

    public void setKZT(double kZT) {
        this.kZT = kZT;
    }

    public double getLAK() {
        return lAK;
    }

    public void setLAK(double lAK) {
        this.lAK = lAK;
    }

    public double getLBP() {
        return lBP;
    }

    public void setLBP(double lBP) {
        this.lBP = lBP;
    }

    public double getLKR() {
        return lKR;
    }

    public void setLKR(double lKR) {
        this.lKR = lKR;
    }

    public double getLRD() {
        return lRD;
    }

    public void setLRD(double lRD) {
        this.lRD = lRD;
    }

    public double getLSL() {
        return lSL;
    }

    public void setLSL(double lSL) {
        this.lSL = lSL;
    }

    public double getLTL() {
        return lTL;
    }

    public void setLTL(double lTL) {
        this.lTL = lTL;
    }

    public double getLVL() {
        return lVL;
    }

    public void setLVL(double lVL) {
        this.lVL = lVL;
    }

    public double getLYD() {
        return lYD;
    }

    public void setLYD(double lYD) {
        this.lYD = lYD;
    }

    public double getMAD() {
        return mAD;
    }

    public void setMAD(double mAD) {
        this.mAD = mAD;
    }

    public double getMDL() {
        return mDL;
    }

    public void setMDL(double mDL) {
        this.mDL = mDL;
    }

    public double getMGA() {
        return mGA;
    }

    public void setMGA(double mGA) {
        this.mGA = mGA;
    }

    public double getMKD() {
        return mKD;
    }

    public void setMKD(double mKD) {
        this.mKD = mKD;
    }

    public double getMMK() {
        return mMK;
    }

    public void setMMK(double mMK) {
        this.mMK = mMK;
    }

    public double getMNT() {
        return mNT;
    }

    public void setMNT(double mNT) {
        this.mNT = mNT;
    }

    public double getMOP() {
        return mOP;
    }

    public void setMOP(double mOP) {
        this.mOP = mOP;
    }

    public double getMRO() {
        return mRO;
    }

    public void setMRO(double mRO) {
        this.mRO = mRO;
    }

    public double getMUR() {
        return mUR;
    }

    public void setMUR(double mUR) {
        this.mUR = mUR;
    }

    public double getMVR() {
        return mVR;
    }

    public void setMVR(double mVR) {
        this.mVR = mVR;
    }

    public double getMWK() {
        return mWK;
    }

    public void setMWK(double mWK) {
        this.mWK = mWK;
    }

    public double getMXN() {
        return mXN;
    }

    public void setMXN(double mXN) {
        this.mXN = mXN;
    }

    public double getMYR() {
        return mYR;
    }

    public void setMYR(double mYR) {
        this.mYR = mYR;
    }

    public double getMZN() {
        return mZN;
    }

    public void setMZN(double mZN) {
        this.mZN = mZN;
    }

    public double getNAD() {
        return nAD;
    }

    public void setNAD(double nAD) {
        this.nAD = nAD;
    }

    public double getNGN() {
        return nGN;
    }

    public void setNGN(double nGN) {
        this.nGN = nGN;
    }

    public double getNIO() {
        return nIO;
    }

    public void setNIO(double nIO) {
        this.nIO = nIO;
    }

    public double getNOK() {
        return nOK;
    }

    public void setNOK(double nOK) {
        this.nOK = nOK;
    }

    public double getNPR() {
        return nPR;
    }

    public void setNPR(double nPR) {
        this.nPR = nPR;
    }

    public double getNZD() {
        return nZD;
    }

    public void setNZD(double nZD) {
        this.nZD = nZD;
    }

    public double getOMR() {
        return oMR;
    }

    public void setOMR(double oMR) {
        this.oMR = oMR;
    }

    public double getPAB() {
        return pAB;
    }

    public void setPAB(double pAB) {
        this.pAB = pAB;
    }

    public double getPEN() {
        return pEN;
    }

    public void setPEN(double pEN) {
        this.pEN = pEN;
    }

    public double getPGK() {
        return pGK;
    }

    public void setPGK(double pGK) {
        this.pGK = pGK;
    }

    public double getPHP() {
        return pHP;
    }

    public void setPHP(double pHP) {
        this.pHP = pHP;
    }

    public double getPKR() {
        return pKR;
    }

    public void setPKR(double pKR) {
        this.pKR = pKR;
    }

    public double getPLN() {
        return pLN;
    }

    public void setPLN(double pLN) {
        this.pLN = pLN;
    }

    public double getPYG() {
        return pYG;
    }

    public void setPYG(double pYG) {
        this.pYG = pYG;
    }

    public double getQAR() {
        return qAR;
    }

    public void setQAR(double qAR) {
        this.qAR = qAR;
    }

    public double getRON() {
        return rON;
    }

    public void setRON(double rON) {
        this.rON = rON;
    }

    public double getRSD() {
        return rSD;
    }

    public void setRSD(double rSD) {
        this.rSD = rSD;
    }

    public double getRUB() {
        return rUB;
    }

    public void setRUB(double rUB) {
        this.rUB = rUB;
    }

    public double getRWF() {
        return rWF;
    }

    public void setRWF(double rWF) {
        this.rWF = rWF;
    }

    public double getSAR() {
        return sAR;
    }

    public void setSAR(double sAR) {
        this.sAR = sAR;
    }

    public double getSBD() {
        return sBD;
    }

    public void setSBD(double sBD) {
        this.sBD = sBD;
    }

    public double getSCR() {
        return sCR;
    }

    public void setSCR(double sCR) {
        this.sCR = sCR;
    }

    public double getSDG() {
        return sDG;
    }

    public void setSDG(double sDG) {
        this.sDG = sDG;
    }

    public double getSEK() {
        return sEK;
    }

    public void setSEK(double sEK) {
        this.sEK = sEK;
    }

    public double getSGD() {
        return sGD;
    }

    public void setSGD(double sGD) {
        this.sGD = sGD;
    }

    public double getSHP() {
        return sHP;
    }

    public void setSHP(double sHP) {
        this.sHP = sHP;
    }

    public double getSLL() {
        return sLL;
    }

    public void setSLL(double sLL) {
        this.sLL = sLL;
    }

    public double getSOS() {
        return sOS;
    }

    public void setSOS(double sOS) {
        this.sOS = sOS;
    }

    public double getSRD() {
        return sRD;
    }

    public void setSRD(double sRD) {
        this.sRD = sRD;
    }

    public double getSTD() {
        return sTD;
    }

    public void setSTD(double sTD) {
        this.sTD = sTD;
    }

    public double getSVC() {
        return sVC;
    }

    public void setSVC(double sVC) {
        this.sVC = sVC;
    }

    public double getSYP() {
        return sYP;
    }

    public void setSYP(double sYP) {
        this.sYP = sYP;
    }

    public double getSZL() {
        return sZL;
    }

    public void setSZL(double sZL) {
        this.sZL = sZL;
    }

    public double getTHB() {
        return tHB;
    }

    public void setTHB(double tHB) {
        this.tHB = tHB;
    }

    public double getTJS() {
        return tJS;
    }

    public void setTJS(double tJS) {
        this.tJS = tJS;
    }

    public double getTMT() {
        return tMT;
    }

    public void setTMT(double tMT) {
        this.tMT = tMT;
    }

    public double getTND() {
        return tND;
    }

    public void setTND(double tND) {
        this.tND = tND;
    }

    public double getTOP() {
        return tOP;
    }

    public void setTOP(double tOP) {
        this.tOP = tOP;
    }

    public double getTRY() {
        return tRY;
    }

    public void setTRY(double tRY) {
        this.tRY = tRY;
    }

    public double getTTD() {
        return tTD;
    }

    public void setTTD(double tTD) {
        this.tTD = tTD;
    }

    public double getTWD() {
        return tWD;
    }

    public void setTWD(double tWD) {
        this.tWD = tWD;
    }

    public double getTZS() {
        return tZS;
    }

    public void setTZS(double tZS) {
        this.tZS = tZS;
    }

    public double getUAH() {
        return uAH;
    }

    public void setUAH(double uAH) {
        this.uAH = uAH;
    }

    public double getUGX() {
        return uGX;
    }

    public void setUGX(double uGX) {
        this.uGX = uGX;
    }

    public double getUSD() {
        return uSD;
    }

    public void setUSD(double uSD) {
        this.uSD = uSD;
    }

    public double getUYU() {
        return uYU;
    }

    public void setUYU(double uYU) {
        this.uYU = uYU;
    }

    public double getUZS() {
        return uZS;
    }

    public void setUZS(double uZS) {
        this.uZS = uZS;
    }

    public double getVEF() {
        return vEF;
    }

    public void setVEF(double vEF) {
        this.vEF = vEF;
    }

    public double getVND() {
        return vND;
    }

    public void setVND(double vND) {
        this.vND = vND;
    }

    public double getVUV() {
        return vUV;
    }

    public void setVUV(double vUV) {
        this.vUV = vUV;
    }

    public double getWST() {
        return wST;
    }

    public void setWST(double wST) {
        this.wST = wST;
    }

    public double getXAF() {
        return xAF;
    }

    public void setXAF(double xAF) {
        this.xAF = xAF;
    }

    public double getXAG() {
        return xAG;
    }

    public void setXAG(double xAG) {
        this.xAG = xAG;
    }

    public double getXAU() {
        return xAU;
    }

    public void setXAU(double xAU) {
        this.xAU = xAU;
    }

    public double getXCD() {
        return xCD;
    }

    public void setXCD(double xCD) {
        this.xCD = xCD;
    }

    public double getXDR() {
        return xDR;
    }

    public void setXDR(double xDR) {
        this.xDR = xDR;
    }

    public double getXOF() {
        return xOF;
    }

    public void setXOF(double xOF) {
        this.xOF = xOF;
    }

    public double getXPF() {
        return xPF;
    }

    public void setXPF(double xPF) {
        this.xPF = xPF;
    }

    public double getYER() {
        return yER;
    }

    public void setYER(double yER) {
        this.yER = yER;
    }

    public double getZAR() {
        return zAR;
    }

    public void setZAR(double zAR) {
        this.zAR = zAR;
    }

    public double getZMK() {
        return zMK;
    }

    public void setZMK(double zMK) {
        this.zMK = zMK;
    }

    public double getZMW() {
        return zMW;
    }

    public void setZMW(double zMW) {
        this.zMW = zMW;
    }

    public double getZWL() {
        return zWL;
    }

    public void setZWL(double zWL) {
        this.zWL = zWL;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(aED);
        dest.writeValue(aFN);
        dest.writeValue(aLL);
        dest.writeValue(aMD);
        dest.writeValue(aNG);
        dest.writeValue(aOA);
        dest.writeValue(aRS);
        dest.writeValue(aUD);
        dest.writeValue(aWG);
        dest.writeValue(aZN);
        dest.writeValue(bAM);
        dest.writeValue(bBD);
        dest.writeValue(bDT);
        dest.writeValue(bGN);
        dest.writeValue(bHD);
        dest.writeValue(bIF);
        dest.writeValue(bMD);
        dest.writeValue(bND);
        dest.writeValue(bOB);
        dest.writeValue(bRL);
        dest.writeValue(bSD);
        dest.writeValue(bTC);
        dest.writeValue(bTN);
        dest.writeValue(bWP);
        dest.writeValue(bYN);
        dest.writeValue(bYR);
        dest.writeValue(bZD);
        dest.writeValue(cAD);
        dest.writeValue(cDF);
        dest.writeValue(cHF);
        dest.writeValue(cLF);
        dest.writeValue(cLP);
        dest.writeValue(cNY);
        dest.writeValue(cOP);
        dest.writeValue(cRC);
        dest.writeValue(cUC);
        dest.writeValue(cUP);
        dest.writeValue(cVE);
        dest.writeValue(cZK);
        dest.writeValue(dJF);
        dest.writeValue(dKK);
        dest.writeValue(dOP);
        dest.writeValue(dZD);
        dest.writeValue(eGP);
        dest.writeValue(eRN);
        dest.writeValue(eTB);
        dest.writeValue(eUR);
        dest.writeValue(fJD);
        dest.writeValue(fKP);
        dest.writeValue(gBP);
        dest.writeValue(gEL);
        dest.writeValue(gGP);
        dest.writeValue(gHS);
        dest.writeValue(gIP);
        dest.writeValue(gMD);
        dest.writeValue(gNF);
        dest.writeValue(gTQ);
        dest.writeValue(gYD);
        dest.writeValue(hKD);
        dest.writeValue(hNL);
        dest.writeValue(hRK);
        dest.writeValue(hTG);
        dest.writeValue(hUF);
        dest.writeValue(iDR);
        dest.writeValue(iLS);
        dest.writeValue(iMP);
        dest.writeValue(iNR);
        dest.writeValue(iQD);
        dest.writeValue(iRR);
        dest.writeValue(iSK);
        dest.writeValue(jEP);
        dest.writeValue(jMD);
        dest.writeValue(jOD);
        dest.writeValue(jPY);
        dest.writeValue(kES);
        dest.writeValue(kGS);
        dest.writeValue(kHR);
        dest.writeValue(kMF);
        dest.writeValue(kPW);
        dest.writeValue(kRW);
        dest.writeValue(kWD);
        dest.writeValue(kYD);
        dest.writeValue(kZT);
        dest.writeValue(lAK);
        dest.writeValue(lBP);
        dest.writeValue(lKR);
        dest.writeValue(lRD);
        dest.writeValue(lSL);
        dest.writeValue(lTL);
        dest.writeValue(lVL);
        dest.writeValue(lYD);
        dest.writeValue(mAD);
        dest.writeValue(mDL);
        dest.writeValue(mGA);
        dest.writeValue(mKD);
        dest.writeValue(mMK);
        dest.writeValue(mNT);
        dest.writeValue(mOP);
        dest.writeValue(mRO);
        dest.writeValue(mUR);
        dest.writeValue(mVR);
        dest.writeValue(mWK);
        dest.writeValue(mXN);
        dest.writeValue(mYR);
        dest.writeValue(mZN);
        dest.writeValue(nAD);
        dest.writeValue(nGN);
        dest.writeValue(nIO);
        dest.writeValue(nOK);
        dest.writeValue(nPR);
        dest.writeValue(nZD);
        dest.writeValue(oMR);
        dest.writeValue(pAB);
        dest.writeValue(pEN);
        dest.writeValue(pGK);
        dest.writeValue(pHP);
        dest.writeValue(pKR);
        dest.writeValue(pLN);
        dest.writeValue(pYG);
        dest.writeValue(qAR);
        dest.writeValue(rON);
        dest.writeValue(rSD);
        dest.writeValue(rUB);
        dest.writeValue(rWF);
        dest.writeValue(sAR);
        dest.writeValue(sBD);
        dest.writeValue(sCR);
        dest.writeValue(sDG);
        dest.writeValue(sEK);
        dest.writeValue(sGD);
        dest.writeValue(sHP);
        dest.writeValue(sLL);
        dest.writeValue(sOS);
        dest.writeValue(sRD);
        dest.writeValue(sTD);
        dest.writeValue(sVC);
        dest.writeValue(sYP);
        dest.writeValue(sZL);
        dest.writeValue(tHB);
        dest.writeValue(tJS);
        dest.writeValue(tMT);
        dest.writeValue(tND);
        dest.writeValue(tOP);
        dest.writeValue(tRY);
        dest.writeValue(tTD);
        dest.writeValue(tWD);
        dest.writeValue(tZS);
        dest.writeValue(uAH);
        dest.writeValue(uGX);
        dest.writeValue(uSD);
        dest.writeValue(uYU);
        dest.writeValue(uZS);
        dest.writeValue(vEF);
        dest.writeValue(vND);
        dest.writeValue(vUV);
        dest.writeValue(wST);
        dest.writeValue(xAF);
        dest.writeValue(xAG);
        dest.writeValue(xAU);
        dest.writeValue(xCD);
        dest.writeValue(xDR);
        dest.writeValue(xOF);
        dest.writeValue(xPF);
        dest.writeValue(yER);
        dest.writeValue(zAR);
        dest.writeValue(zMK);
        dest.writeValue(zMW);
        dest.writeValue(zWL);
    }

    public int describeContents() {
        return 0;
    }
}
