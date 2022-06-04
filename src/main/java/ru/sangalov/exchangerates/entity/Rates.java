
package ru.sangalov.exchangerates.entity;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AED",
    "AFN",
    "ALL",
    "AMD",
    "ANG",
    "AOA",
    "ARS",
    "AUD",
    "AWG",
    "AZN",
    "BAM",
    "BBD",
    "BDT",
    "BGN",
    "BHD",
    "BIF",
    "BMD",
    "BND",
    "BOB",
    "BRL",
    "BSD",
    "BTC",
    "BTN",
    "BWP",
    "BYN",
    "BZD",
    "CAD",
    "CDF",
    "CHF",
    "CLF",
    "CLP",
    "CNH",
    "CNY",
    "COP",
    "CRC",
    "CUC",
    "CUP",
    "CVE",
    "CZK",
    "DJF",
    "DKK",
    "DOP",
    "DZD",
    "EGP",
    "ERN",
    "ETB",
    "EUR",
    "FJD",
    "FKP",
    "GBP",
    "GEL",
    "GGP",
    "GHS",
    "GIP",
    "GMD",
    "GNF",
    "GTQ",
    "GYD",
    "HKD",
    "HNL",
    "HRK",
    "HTG",
    "HUF",
    "IDR",
    "ILS",
    "IMP",
    "INR",
    "IQD",
    "IRR",
    "ISK",
    "JEP",
    "JMD",
    "JOD",
    "JPY",
    "KES",
    "KGS",
    "KHR",
    "KMF",
    "KPW",
    "KRW",
    "KWD",
    "KYD",
    "KZT",
    "LAK",
    "LBP",
    "LKR",
    "LRD",
    "LSL",
    "LYD",
    "MAD",
    "MDL",
    "MGA",
    "MKD",
    "MMK",
    "MNT",
    "MOP",
    "MRU",
    "MUR",
    "MVR",
    "MWK",
    "MXN",
    "MYR",
    "MZN",
    "NAD",
    "NGN",
    "NIO",
    "NOK",
    "NPR",
    "NZD",
    "OMR",
    "PAB",
    "PEN",
    "PGK",
    "PHP",
    "PKR",
    "PLN",
    "PYG",
    "QAR",
    "RON",
    "RSD",
    "RUB",
    "RWF",
    "SAR",
    "SBD",
    "SCR",
    "SDG",
    "SEK",
    "SGD",
    "SHP",
    "SLL",
    "SOS",
    "SRD",
    "SSP",
    "STD",
    "STN",
    "SVC",
    "SYP",
    "SZL",
    "THB",
    "TJS",
    "TMT",
    "TND",
    "TOP",
    "TRY",
    "TTD",
    "TWD",
    "TZS",
    "UAH",
    "UGX",
    "USD",
    "UYU",
    "UZS",
    "VES",
    "VND",
    "VUV",
    "WST",
    "XAF",
    "XAG",
    "XAU",
    "XCD",
    "XDR",
    "XOF",
    "XPD",
    "XPF",
    "XPT",
    "YER",
    "ZAR",
    "ZMW",
    "ZWL"
})
@Generated("jsonschema2pojo")
public class Rates {

    @JsonProperty("AED")
    private Double aed;
    @JsonProperty("AFN")
    private Double afn;
    @JsonProperty("ALL")
    private Double all;
    @JsonProperty("AMD")
    private Double amd;
    @JsonProperty("ANG")
    private Double ang;
    @JsonProperty("AOA")
    private Double aoa;
    @JsonProperty("ARS")
    private Double ars;
    @JsonProperty("AUD")
    private Double aud;
    @JsonProperty("AWG")
    private Double awg;
    @JsonProperty("AZN")
    private Double azn;
    @JsonProperty("BAM")
    private Double bam;
    @JsonProperty("BBD")
    private Integer bbd;
    @JsonProperty("BDT")
    private Double bdt;
    @JsonProperty("BGN")
    private Double bgn;
    @JsonProperty("BHD")
    private Double bhd;
    @JsonProperty("BIF")
    private Double bif;
    @JsonProperty("BMD")
    private Integer bmd;
    @JsonProperty("BND")
    private Double bnd;
    @JsonProperty("BOB")
    private Double bob;
    @JsonProperty("BRL")
    private Double brl;
    @JsonProperty("BSD")
    private Integer bsd;
    @JsonProperty("BTC")
    private Double btc;
    @JsonProperty("BTN")
    private Double btn;
    @JsonProperty("BWP")
    private Double bwp;
    @JsonProperty("BYN")
    private Double byn;
    @JsonProperty("BZD")
    private Double bzd;
    @JsonProperty("CAD")
    private Double cad;
    @JsonProperty("CDF")
    private Double cdf;
    @JsonProperty("CHF")
    private Double chf;
    @JsonProperty("CLF")
    private Double clf;
    @JsonProperty("CLP")
    private Double clp;
    @JsonProperty("CNH")
    private Double cnh;
    @JsonProperty("CNY")
    private Double cny;
    @JsonProperty("COP")
    private Double cop;
    @JsonProperty("CRC")
    private Double crc;
    @JsonProperty("CUC")
    private Integer cuc;
    @JsonProperty("CUP")
    private Double cup;
    @JsonProperty("CVE")
    private Double cve;
    @JsonProperty("CZK")
    private Double czk;
    @JsonProperty("DJF")
    private Double djf;
    @JsonProperty("DKK")
    private Double dkk;
    @JsonProperty("DOP")
    private Double dop;
    @JsonProperty("DZD")
    private Double dzd;
    @JsonProperty("EGP")
    private Double egp;
    @JsonProperty("ERN")
    private Double ern;
    @JsonProperty("ETB")
    private Double etb;
    @JsonProperty("EUR")
    private Double eur;
    @JsonProperty("FJD")
    private Double fjd;
    @JsonProperty("FKP")
    private Double fkp;
    @JsonProperty("GBP")
    private Double gbp;
    @JsonProperty("GEL")
    private Double gel;
    @JsonProperty("GGP")
    private Double ggp;
    @JsonProperty("GHS")
    private Double ghs;
    @JsonProperty("GIP")
    private Double gip;
    @JsonProperty("GMD")
    private Double gmd;
    @JsonProperty("GNF")
    private Double gnf;
    @JsonProperty("GTQ")
    private Double gtq;
    @JsonProperty("GYD")
    private Double gyd;
    @JsonProperty("HKD")
    private Double hkd;
    @JsonProperty("HNL")
    private Double hnl;
    @JsonProperty("HRK")
    private Double hrk;
    @JsonProperty("HTG")
    private Double htg;
    @JsonProperty("HUF")
    private Double huf;
    @JsonProperty("IDR")
    private Double idr;
    @JsonProperty("ILS")
    private Double ils;
    @JsonProperty("IMP")
    private Double imp;
    @JsonProperty("INR")
    private Double inr;
    @JsonProperty("IQD")
    private Double iqd;
    @JsonProperty("IRR")
    private Integer irr;
    @JsonProperty("ISK")
    private Double isk;
    @JsonProperty("JEP")
    private Double jep;
    @JsonProperty("JMD")
    private Double jmd;
    @JsonProperty("JOD")
    private Double jod;
    @JsonProperty("JPY")
    private Double jpy;
    @JsonProperty("KES")
    private Double kes;
    @JsonProperty("KGS")
    private Double kgs;
    @JsonProperty("KHR")
    private Double khr;
    @JsonProperty("KMF")
    private Double kmf;
    @JsonProperty("KPW")
    private Integer kpw;
    @JsonProperty("KRW")
    private Double krw;
    @JsonProperty("KWD")
    private Double kwd;
    @JsonProperty("KYD")
    private Double kyd;
    @JsonProperty("KZT")
    private Double kzt;
    @JsonProperty("LAK")
    private Double lak;
    @JsonProperty("LBP")
    private Double lbp;
    @JsonProperty("LKR")
    private Double lkr;
    @JsonProperty("LRD")
    private Double lrd;
    @JsonProperty("LSL")
    private Double lsl;
    @JsonProperty("LYD")
    private Double lyd;
    @JsonProperty("MAD")
    private Double mad;
    @JsonProperty("MDL")
    private Double mdl;
    @JsonProperty("MGA")
    private Double mga;
    @JsonProperty("MKD")
    private Double mkd;
    @JsonProperty("MMK")
    private Double mmk;
    @JsonProperty("MNT")
    private Double mnt;
    @JsonProperty("MOP")
    private Double mop;
    @JsonProperty("MRU")
    private Double mru;
    @JsonProperty("MUR")
    private Double mur;
    @JsonProperty("MVR")
    private Double mvr;
    @JsonProperty("MWK")
    private Double mwk;
    @JsonProperty("MXN")
    private Double mxn;
    @JsonProperty("MYR")
    private Double myr;
    @JsonProperty("MZN")
    private Double mzn;
    @JsonProperty("NAD")
    private Double nad;
    @JsonProperty("NGN")
    private Double ngn;
    @JsonProperty("NIO")
    private Double nio;
    @JsonProperty("NOK")
    private Double nok;
    @JsonProperty("NPR")
    private Double npr;
    @JsonProperty("NZD")
    private Double nzd;
    @JsonProperty("OMR")
    private Double omr;
    @JsonProperty("PAB")
    private Integer pab;
    @JsonProperty("PEN")
    private Double pen;
    @JsonProperty("PGK")
    private Double pgk;
    @JsonProperty("PHP")
    private Double php;
    @JsonProperty("PKR")
    private Double pkr;
    @JsonProperty("PLN")
    private Double pln;
    @JsonProperty("PYG")
    private Double pyg;
    @JsonProperty("QAR")
    private Double qar;
    @JsonProperty("RON")
    private Double ron;
    @JsonProperty("RSD")
    private Double rsd;
    @JsonProperty("RUB")
    private Double rub;
    @JsonProperty("RWF")
    private Double rwf;
    @JsonProperty("SAR")
    private Double sar;
    @JsonProperty("SBD")
    private Double sbd;
    @JsonProperty("SCR")
    private Double scr;
    @JsonProperty("SDG")
    private Integer sdg;
    @JsonProperty("SEK")
    private Double sek;
    @JsonProperty("SGD")
    private Double sgd;
    @JsonProperty("SHP")
    private Double shp;
    @JsonProperty("SLL")
    private Double sll;
    @JsonProperty("SOS")
    private Double sos;
    @JsonProperty("SRD")
    private Double srd;
    @JsonProperty("SSP")
    private Double ssp;
    @JsonProperty("STD")
    private Integer std;
    @JsonProperty("STN")
    private Double stn;
    @JsonProperty("SVC")
    private Double svc;
    @JsonProperty("SYP")
    private Double syp;
    @JsonProperty("SZL")
    private Double szl;
    @JsonProperty("THB")
    private Double thb;
    @JsonProperty("TJS")
    private Double tjs;
    @JsonProperty("TMT")
    private Double tmt;
    @JsonProperty("TND")
    private Double tnd;
    @JsonProperty("TOP")
    private Double top;
    @JsonProperty("TRY")
    private Double _try;
    @JsonProperty("TTD")
    private Double ttd;
    @JsonProperty("TWD")
    private Double twd;
    @JsonProperty("TZS")
    private Integer tzs;
    @JsonProperty("UAH")
    private Double uah;
    @JsonProperty("UGX")
    private Double ugx;
    @JsonProperty("USD")
    private Integer usd;
    @JsonProperty("UYU")
    private Double uyu;
    @JsonProperty("UZS")
    private Double uzs;
    @JsonProperty("VES")
    private Double ves;
    @JsonProperty("VND")
    private Integer vnd;
    @JsonProperty("VUV")
    private Double vuv;
    @JsonProperty("WST")
    private Double wst;
    @JsonProperty("XAF")
    private Double xaf;
    @JsonProperty("XAG")
    private Double xag;
    @JsonProperty("XAU")
    private Double xau;
    @JsonProperty("XCD")
    private Double xcd;
    @JsonProperty("XDR")
    private Double xdr;
    @JsonProperty("XOF")
    private Double xof;
    @JsonProperty("XPD")
    private Double xpd;
    @JsonProperty("XPF")
    private Double xpf;
    @JsonProperty("XPT")
    private Double xpt;
    @JsonProperty("YER")
    private Double yer;
    @JsonProperty("ZAR")
    private Double zar;
    @JsonProperty("ZMW")
    private Double zmw;
    @JsonProperty("ZWL")
    private Integer zwl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AED")
    public Double getAed() {
        return aed;
    }

    @JsonProperty("AED")
    public void setAed(Double aed) {
        this.aed = aed;
    }

    @JsonProperty("AFN")
    public Double getAfn() {
        return afn;
    }

    @JsonProperty("AFN")
    public void setAfn(Double afn) {
        this.afn = afn;
    }

    @JsonProperty("ALL")
    public Double getAll() {
        return all;
    }

    @JsonProperty("ALL")
    public void setAll(Double all) {
        this.all = all;
    }

    @JsonProperty("AMD")
    public Double getAmd() {
        return amd;
    }

    @JsonProperty("AMD")
    public void setAmd(Double amd) {
        this.amd = amd;
    }

    @JsonProperty("ANG")
    public Double getAng() {
        return ang;
    }

    @JsonProperty("ANG")
    public void setAng(Double ang) {
        this.ang = ang;
    }

    @JsonProperty("AOA")
    public Double getAoa() {
        return aoa;
    }

    @JsonProperty("AOA")
    public void setAoa(Double aoa) {
        this.aoa = aoa;
    }

    @JsonProperty("ARS")
    public Double getArs() {
        return ars;
    }

    @JsonProperty("ARS")
    public void setArs(Double ars) {
        this.ars = ars;
    }

    @JsonProperty("AUD")
    public Double getAud() {
        return aud;
    }

    @JsonProperty("AUD")
    public void setAud(Double aud) {
        this.aud = aud;
    }

    @JsonProperty("AWG")
    public Double getAwg() {
        return awg;
    }

    @JsonProperty("AWG")
    public void setAwg(Double awg) {
        this.awg = awg;
    }

    @JsonProperty("AZN")
    public Double getAzn() {
        return azn;
    }

    @JsonProperty("AZN")
    public void setAzn(Double azn) {
        this.azn = azn;
    }

    @JsonProperty("BAM")
    public Double getBam() {
        return bam;
    }

    @JsonProperty("BAM")
    public void setBam(Double bam) {
        this.bam = bam;
    }

    @JsonProperty("BBD")
    public Integer getBbd() {
        return bbd;
    }

    @JsonProperty("BBD")
    public void setBbd(Integer bbd) {
        this.bbd = bbd;
    }

    @JsonProperty("BDT")
    public Double getBdt() {
        return bdt;
    }

    @JsonProperty("BDT")
    public void setBdt(Double bdt) {
        this.bdt = bdt;
    }

    @JsonProperty("BGN")
    public Double getBgn() {
        return bgn;
    }

    @JsonProperty("BGN")
    public void setBgn(Double bgn) {
        this.bgn = bgn;
    }

    @JsonProperty("BHD")
    public Double getBhd() {
        return bhd;
    }

    @JsonProperty("BHD")
    public void setBhd(Double bhd) {
        this.bhd = bhd;
    }

    @JsonProperty("BIF")
    public Double getBif() {
        return bif;
    }

    @JsonProperty("BIF")
    public void setBif(Double bif) {
        this.bif = bif;
    }

    @JsonProperty("BMD")
    public Integer getBmd() {
        return bmd;
    }

    @JsonProperty("BMD")
    public void setBmd(Integer bmd) {
        this.bmd = bmd;
    }

    @JsonProperty("BND")
    public Double getBnd() {
        return bnd;
    }

    @JsonProperty("BND")
    public void setBnd(Double bnd) {
        this.bnd = bnd;
    }

    @JsonProperty("BOB")
    public Double getBob() {
        return bob;
    }

    @JsonProperty("BOB")
    public void setBob(Double bob) {
        this.bob = bob;
    }

    @JsonProperty("BRL")
    public Double getBrl() {
        return brl;
    }

    @JsonProperty("BRL")
    public void setBrl(Double brl) {
        this.brl = brl;
    }

    @JsonProperty("BSD")
    public Integer getBsd() {
        return bsd;
    }

    @JsonProperty("BSD")
    public void setBsd(Integer bsd) {
        this.bsd = bsd;
    }

    @JsonProperty("BTC")
    public Double getBtc() {
        return btc;
    }

    @JsonProperty("BTC")
    public void setBtc(Double btc) {
        this.btc = btc;
    }

    @JsonProperty("BTN")
    public Double getBtn() {
        return btn;
    }

    @JsonProperty("BTN")
    public void setBtn(Double btn) {
        this.btn = btn;
    }

    @JsonProperty("BWP")
    public Double getBwp() {
        return bwp;
    }

    @JsonProperty("BWP")
    public void setBwp(Double bwp) {
        this.bwp = bwp;
    }

    @JsonProperty("BYN")
    public Double getByn() {
        return byn;
    }

    @JsonProperty("BYN")
    public void setByn(Double byn) {
        this.byn = byn;
    }

    @JsonProperty("BZD")
    public Double getBzd() {
        return bzd;
    }

    @JsonProperty("BZD")
    public void setBzd(Double bzd) {
        this.bzd = bzd;
    }

    @JsonProperty("CAD")
    public Double getCad() {
        return cad;
    }

    @JsonProperty("CAD")
    public void setCad(Double cad) {
        this.cad = cad;
    }

    @JsonProperty("CDF")
    public Double getCdf() {
        return cdf;
    }

    @JsonProperty("CDF")
    public void setCdf(Double cdf) {
        this.cdf = cdf;
    }

    @JsonProperty("CHF")
    public Double getChf() {
        return chf;
    }

    @JsonProperty("CHF")
    public void setChf(Double chf) {
        this.chf = chf;
    }

    @JsonProperty("CLF")
    public Double getClf() {
        return clf;
    }

    @JsonProperty("CLF")
    public void setClf(Double clf) {
        this.clf = clf;
    }

    @JsonProperty("CLP")
    public Double getClp() {
        return clp;
    }

    @JsonProperty("CLP")
    public void setClp(Double clp) {
        this.clp = clp;
    }

    @JsonProperty("CNH")
    public Double getCnh() {
        return cnh;
    }

    @JsonProperty("CNH")
    public void setCnh(Double cnh) {
        this.cnh = cnh;
    }

    @JsonProperty("CNY")
    public Double getCny() {
        return cny;
    }

    @JsonProperty("CNY")
    public void setCny(Double cny) {
        this.cny = cny;
    }

    @JsonProperty("COP")
    public Double getCop() {
        return cop;
    }

    @JsonProperty("COP")
    public void setCop(Double cop) {
        this.cop = cop;
    }

    @JsonProperty("CRC")
    public Double getCrc() {
        return crc;
    }

    @JsonProperty("CRC")
    public void setCrc(Double crc) {
        this.crc = crc;
    }

    @JsonProperty("CUC")
    public Integer getCuc() {
        return cuc;
    }

    @JsonProperty("CUC")
    public void setCuc(Integer cuc) {
        this.cuc = cuc;
    }

    @JsonProperty("CUP")
    public Double getCup() {
        return cup;
    }

    @JsonProperty("CUP")
    public void setCup(Double cup) {
        this.cup = cup;
    }

    @JsonProperty("CVE")
    public Double getCve() {
        return cve;
    }

    @JsonProperty("CVE")
    public void setCve(Double cve) {
        this.cve = cve;
    }

    @JsonProperty("CZK")
    public Double getCzk() {
        return czk;
    }

    @JsonProperty("CZK")
    public void setCzk(Double czk) {
        this.czk = czk;
    }

    @JsonProperty("DJF")
    public Double getDjf() {
        return djf;
    }

    @JsonProperty("DJF")
    public void setDjf(Double djf) {
        this.djf = djf;
    }

    @JsonProperty("DKK")
    public Double getDkk() {
        return dkk;
    }

    @JsonProperty("DKK")
    public void setDkk(Double dkk) {
        this.dkk = dkk;
    }

    @JsonProperty("DOP")
    public Double getDop() {
        return dop;
    }

    @JsonProperty("DOP")
    public void setDop(Double dop) {
        this.dop = dop;
    }

    @JsonProperty("DZD")
    public Double getDzd() {
        return dzd;
    }

    @JsonProperty("DZD")
    public void setDzd(Double dzd) {
        this.dzd = dzd;
    }

    @JsonProperty("EGP")
    public Double getEgp() {
        return egp;
    }

    @JsonProperty("EGP")
    public void setEgp(Double egp) {
        this.egp = egp;
    }

    @JsonProperty("ERN")
    public Double getErn() {
        return ern;
    }

    @JsonProperty("ERN")
    public void setErn(Double ern) {
        this.ern = ern;
    }

    @JsonProperty("ETB")
    public Double getEtb() {
        return etb;
    }

    @JsonProperty("ETB")
    public void setEtb(Double etb) {
        this.etb = etb;
    }

    @JsonProperty("EUR")
    public Double getEur() {
        return eur;
    }

    @JsonProperty("EUR")
    public void setEur(Double eur) {
        this.eur = eur;
    }

    @JsonProperty("FJD")
    public Double getFjd() {
        return fjd;
    }

    @JsonProperty("FJD")
    public void setFjd(Double fjd) {
        this.fjd = fjd;
    }

    @JsonProperty("FKP")
    public Double getFkp() {
        return fkp;
    }

    @JsonProperty("FKP")
    public void setFkp(Double fkp) {
        this.fkp = fkp;
    }

    @JsonProperty("GBP")
    public Double getGbp() {
        return gbp;
    }

    @JsonProperty("GBP")
    public void setGbp(Double gbp) {
        this.gbp = gbp;
    }

    @JsonProperty("GEL")
    public Double getGel() {
        return gel;
    }

    @JsonProperty("GEL")
    public void setGel(Double gel) {
        this.gel = gel;
    }

    @JsonProperty("GGP")
    public Double getGgp() {
        return ggp;
    }

    @JsonProperty("GGP")
    public void setGgp(Double ggp) {
        this.ggp = ggp;
    }

    @JsonProperty("GHS")
    public Double getGhs() {
        return ghs;
    }

    @JsonProperty("GHS")
    public void setGhs(Double ghs) {
        this.ghs = ghs;
    }

    @JsonProperty("GIP")
    public Double getGip() {
        return gip;
    }

    @JsonProperty("GIP")
    public void setGip(Double gip) {
        this.gip = gip;
    }

    @JsonProperty("GMD")
    public Double getGmd() {
        return gmd;
    }

    @JsonProperty("GMD")
    public void setGmd(Double gmd) {
        this.gmd = gmd;
    }

    @JsonProperty("GNF")
    public Double getGnf() {
        return gnf;
    }

    @JsonProperty("GNF")
    public void setGnf(Double gnf) {
        this.gnf = gnf;
    }

    @JsonProperty("GTQ")
    public Double getGtq() {
        return gtq;
    }

    @JsonProperty("GTQ")
    public void setGtq(Double gtq) {
        this.gtq = gtq;
    }

    @JsonProperty("GYD")
    public Double getGyd() {
        return gyd;
    }

    @JsonProperty("GYD")
    public void setGyd(Double gyd) {
        this.gyd = gyd;
    }

    @JsonProperty("HKD")
    public Double getHkd() {
        return hkd;
    }

    @JsonProperty("HKD")
    public void setHkd(Double hkd) {
        this.hkd = hkd;
    }

    @JsonProperty("HNL")
    public Double getHnl() {
        return hnl;
    }

    @JsonProperty("HNL")
    public void setHnl(Double hnl) {
        this.hnl = hnl;
    }

    @JsonProperty("HRK")
    public Double getHrk() {
        return hrk;
    }

    @JsonProperty("HRK")
    public void setHrk(Double hrk) {
        this.hrk = hrk;
    }

    @JsonProperty("HTG")
    public Double getHtg() {
        return htg;
    }

    @JsonProperty("HTG")
    public void setHtg(Double htg) {
        this.htg = htg;
    }

    @JsonProperty("HUF")
    public Double getHuf() {
        return huf;
    }

    @JsonProperty("HUF")
    public void setHuf(Double huf) {
        this.huf = huf;
    }

    @JsonProperty("IDR")
    public Double getIdr() {
        return idr;
    }

    @JsonProperty("IDR")
    public void setIdr(Double idr) {
        this.idr = idr;
    }

    @JsonProperty("ILS")
    public Double getIls() {
        return ils;
    }

    @JsonProperty("ILS")
    public void setIls(Double ils) {
        this.ils = ils;
    }

    @JsonProperty("IMP")
    public Double getImp() {
        return imp;
    }

    @JsonProperty("IMP")
    public void setImp(Double imp) {
        this.imp = imp;
    }

    @JsonProperty("INR")
    public Double getInr() {
        return inr;
    }

    @JsonProperty("INR")
    public void setInr(Double inr) {
        this.inr = inr;
    }

    @JsonProperty("IQD")
    public Double getIqd() {
        return iqd;
    }

    @JsonProperty("IQD")
    public void setIqd(Double iqd) {
        this.iqd = iqd;
    }

    @JsonProperty("IRR")
    public Integer getIrr() {
        return irr;
    }

    @JsonProperty("IRR")
    public void setIrr(Integer irr) {
        this.irr = irr;
    }

    @JsonProperty("ISK")
    public Double getIsk() {
        return isk;
    }

    @JsonProperty("ISK")
    public void setIsk(Double isk) {
        this.isk = isk;
    }

    @JsonProperty("JEP")
    public Double getJep() {
        return jep;
    }

    @JsonProperty("JEP")
    public void setJep(Double jep) {
        this.jep = jep;
    }

    @JsonProperty("JMD")
    public Double getJmd() {
        return jmd;
    }

    @JsonProperty("JMD")
    public void setJmd(Double jmd) {
        this.jmd = jmd;
    }

    @JsonProperty("JOD")
    public Double getJod() {
        return jod;
    }

    @JsonProperty("JOD")
    public void setJod(Double jod) {
        this.jod = jod;
    }

    @JsonProperty("JPY")
    public Double getJpy() {
        return jpy;
    }

    @JsonProperty("JPY")
    public void setJpy(Double jpy) {
        this.jpy = jpy;
    }

    @JsonProperty("KES")
    public Double getKes() {
        return kes;
    }

    @JsonProperty("KES")
    public void setKes(Double kes) {
        this.kes = kes;
    }

    @JsonProperty("KGS")
    public Double getKgs() {
        return kgs;
    }

    @JsonProperty("KGS")
    public void setKgs(Double kgs) {
        this.kgs = kgs;
    }

    @JsonProperty("KHR")
    public Double getKhr() {
        return khr;
    }

    @JsonProperty("KHR")
    public void setKhr(Double khr) {
        this.khr = khr;
    }

    @JsonProperty("KMF")
    public Double getKmf() {
        return kmf;
    }

    @JsonProperty("KMF")
    public void setKmf(Double kmf) {
        this.kmf = kmf;
    }

    @JsonProperty("KPW")
    public Integer getKpw() {
        return kpw;
    }

    @JsonProperty("KPW")
    public void setKpw(Integer kpw) {
        this.kpw = kpw;
    }

    @JsonProperty("KRW")
    public Double getKrw() {
        return krw;
    }

    @JsonProperty("KRW")
    public void setKrw(Double krw) {
        this.krw = krw;
    }

    @JsonProperty("KWD")
    public Double getKwd() {
        return kwd;
    }

    @JsonProperty("KWD")
    public void setKwd(Double kwd) {
        this.kwd = kwd;
    }

    @JsonProperty("KYD")
    public Double getKyd() {
        return kyd;
    }

    @JsonProperty("KYD")
    public void setKyd(Double kyd) {
        this.kyd = kyd;
    }

    @JsonProperty("KZT")
    public Double getKzt() {
        return kzt;
    }

    @JsonProperty("KZT")
    public void setKzt(Double kzt) {
        this.kzt = kzt;
    }

    @JsonProperty("LAK")
    public Double getLak() {
        return lak;
    }

    @JsonProperty("LAK")
    public void setLak(Double lak) {
        this.lak = lak;
    }

    @JsonProperty("LBP")
    public Double getLbp() {
        return lbp;
    }

    @JsonProperty("LBP")
    public void setLbp(Double lbp) {
        this.lbp = lbp;
    }

    @JsonProperty("LKR")
    public Double getLkr() {
        return lkr;
    }

    @JsonProperty("LKR")
    public void setLkr(Double lkr) {
        this.lkr = lkr;
    }

    @JsonProperty("LRD")
    public Double getLrd() {
        return lrd;
    }

    @JsonProperty("LRD")
    public void setLrd(Double lrd) {
        this.lrd = lrd;
    }

    @JsonProperty("LSL")
    public Double getLsl() {
        return lsl;
    }

    @JsonProperty("LSL")
    public void setLsl(Double lsl) {
        this.lsl = lsl;
    }

    @JsonProperty("LYD")
    public Double getLyd() {
        return lyd;
    }

    @JsonProperty("LYD")
    public void setLyd(Double lyd) {
        this.lyd = lyd;
    }

    @JsonProperty("MAD")
    public Double getMad() {
        return mad;
    }

    @JsonProperty("MAD")
    public void setMad(Double mad) {
        this.mad = mad;
    }

    @JsonProperty("MDL")
    public Double getMdl() {
        return mdl;
    }

    @JsonProperty("MDL")
    public void setMdl(Double mdl) {
        this.mdl = mdl;
    }

    @JsonProperty("MGA")
    public Double getMga() {
        return mga;
    }

    @JsonProperty("MGA")
    public void setMga(Double mga) {
        this.mga = mga;
    }

    @JsonProperty("MKD")
    public Double getMkd() {
        return mkd;
    }

    @JsonProperty("MKD")
    public void setMkd(Double mkd) {
        this.mkd = mkd;
    }

    @JsonProperty("MMK")
    public Double getMmk() {
        return mmk;
    }

    @JsonProperty("MMK")
    public void setMmk(Double mmk) {
        this.mmk = mmk;
    }

    @JsonProperty("MNT")
    public Double getMnt() {
        return mnt;
    }

    @JsonProperty("MNT")
    public void setMnt(Double mnt) {
        this.mnt = mnt;
    }

    @JsonProperty("MOP")
    public Double getMop() {
        return mop;
    }

    @JsonProperty("MOP")
    public void setMop(Double mop) {
        this.mop = mop;
    }

    @JsonProperty("MRU")
    public Double getMru() {
        return mru;
    }

    @JsonProperty("MRU")
    public void setMru(Double mru) {
        this.mru = mru;
    }

    @JsonProperty("MUR")
    public Double getMur() {
        return mur;
    }

    @JsonProperty("MUR")
    public void setMur(Double mur) {
        this.mur = mur;
    }

    @JsonProperty("MVR")
    public Double getMvr() {
        return mvr;
    }

    @JsonProperty("MVR")
    public void setMvr(Double mvr) {
        this.mvr = mvr;
    }

    @JsonProperty("MWK")
    public Double getMwk() {
        return mwk;
    }

    @JsonProperty("MWK")
    public void setMwk(Double mwk) {
        this.mwk = mwk;
    }

    @JsonProperty("MXN")
    public Double getMxn() {
        return mxn;
    }

    @JsonProperty("MXN")
    public void setMxn(Double mxn) {
        this.mxn = mxn;
    }

    @JsonProperty("MYR")
    public Double getMyr() {
        return myr;
    }

    @JsonProperty("MYR")
    public void setMyr(Double myr) {
        this.myr = myr;
    }

    @JsonProperty("MZN")
    public Double getMzn() {
        return mzn;
    }

    @JsonProperty("MZN")
    public void setMzn(Double mzn) {
        this.mzn = mzn;
    }

    @JsonProperty("NAD")
    public Double getNad() {
        return nad;
    }

    @JsonProperty("NAD")
    public void setNad(Double nad) {
        this.nad = nad;
    }

    @JsonProperty("NGN")
    public Double getNgn() {
        return ngn;
    }

    @JsonProperty("NGN")
    public void setNgn(Double ngn) {
        this.ngn = ngn;
    }

    @JsonProperty("NIO")
    public Double getNio() {
        return nio;
    }

    @JsonProperty("NIO")
    public void setNio(Double nio) {
        this.nio = nio;
    }

    @JsonProperty("NOK")
    public Double getNok() {
        return nok;
    }

    @JsonProperty("NOK")
    public void setNok(Double nok) {
        this.nok = nok;
    }

    @JsonProperty("NPR")
    public Double getNpr() {
        return npr;
    }

    @JsonProperty("NPR")
    public void setNpr(Double npr) {
        this.npr = npr;
    }

    @JsonProperty("NZD")
    public Double getNzd() {
        return nzd;
    }

    @JsonProperty("NZD")
    public void setNzd(Double nzd) {
        this.nzd = nzd;
    }

    @JsonProperty("OMR")
    public Double getOmr() {
        return omr;
    }

    @JsonProperty("OMR")
    public void setOmr(Double omr) {
        this.omr = omr;
    }

    @JsonProperty("PAB")
    public Integer getPab() {
        return pab;
    }

    @JsonProperty("PAB")
    public void setPab(Integer pab) {
        this.pab = pab;
    }

    @JsonProperty("PEN")
    public Double getPen() {
        return pen;
    }

    @JsonProperty("PEN")
    public void setPen(Double pen) {
        this.pen = pen;
    }

    @JsonProperty("PGK")
    public Double getPgk() {
        return pgk;
    }

    @JsonProperty("PGK")
    public void setPgk(Double pgk) {
        this.pgk = pgk;
    }

    @JsonProperty("PHP")
    public Double getPhp() {
        return php;
    }

    @JsonProperty("PHP")
    public void setPhp(Double php) {
        this.php = php;
    }

    @JsonProperty("PKR")
    public Double getPkr() {
        return pkr;
    }

    @JsonProperty("PKR")
    public void setPkr(Double pkr) {
        this.pkr = pkr;
    }

    @JsonProperty("PLN")
    public Double getPln() {
        return pln;
    }

    @JsonProperty("PLN")
    public void setPln(Double pln) {
        this.pln = pln;
    }

    @JsonProperty("PYG")
    public Double getPyg() {
        return pyg;
    }

    @JsonProperty("PYG")
    public void setPyg(Double pyg) {
        this.pyg = pyg;
    }

    @JsonProperty("QAR")
    public Double getQar() {
        return qar;
    }

    @JsonProperty("QAR")
    public void setQar(Double qar) {
        this.qar = qar;
    }

    @JsonProperty("RON")
    public Double getRon() {
        return ron;
    }

    @JsonProperty("RON")
    public void setRon(Double ron) {
        this.ron = ron;
    }

    @JsonProperty("RSD")
    public Double getRsd() {
        return rsd;
    }

    @JsonProperty("RSD")
    public void setRsd(Double rsd) {
        this.rsd = rsd;
    }

    @JsonProperty("RUB")
    public Double getRub() {
        return rub;
    }

    @JsonProperty("RUB")
    public void setRub(Double rub) {
        this.rub = rub;
    }

    @JsonProperty("RWF")
    public Double getRwf() {
        return rwf;
    }

    @JsonProperty("RWF")
    public void setRwf(Double rwf) {
        this.rwf = rwf;
    }

    @JsonProperty("SAR")
    public Double getSar() {
        return sar;
    }

    @JsonProperty("SAR")
    public void setSar(Double sar) {
        this.sar = sar;
    }

    @JsonProperty("SBD")
    public Double getSbd() {
        return sbd;
    }

    @JsonProperty("SBD")
    public void setSbd(Double sbd) {
        this.sbd = sbd;
    }

    @JsonProperty("SCR")
    public Double getScr() {
        return scr;
    }

    @JsonProperty("SCR")
    public void setScr(Double scr) {
        this.scr = scr;
    }

    @JsonProperty("SDG")
    public Integer getSdg() {
        return sdg;
    }

    @JsonProperty("SDG")
    public void setSdg(Integer sdg) {
        this.sdg = sdg;
    }

    @JsonProperty("SEK")
    public Double getSek() {
        return sek;
    }

    @JsonProperty("SEK")
    public void setSek(Double sek) {
        this.sek = sek;
    }

    @JsonProperty("SGD")
    public Double getSgd() {
        return sgd;
    }

    @JsonProperty("SGD")
    public void setSgd(Double sgd) {
        this.sgd = sgd;
    }

    @JsonProperty("SHP")
    public Double getShp() {
        return shp;
    }

    @JsonProperty("SHP")
    public void setShp(Double shp) {
        this.shp = shp;
    }

    @JsonProperty("SLL")
    public Double getSll() {
        return sll;
    }

    @JsonProperty("SLL")
    public void setSll(Double sll) {
        this.sll = sll;
    }

    @JsonProperty("SOS")
    public Double getSos() {
        return sos;
    }

    @JsonProperty("SOS")
    public void setSos(Double sos) {
        this.sos = sos;
    }

    @JsonProperty("SRD")
    public Double getSrd() {
        return srd;
    }

    @JsonProperty("SRD")
    public void setSrd(Double srd) {
        this.srd = srd;
    }

    @JsonProperty("SSP")
    public Double getSsp() {
        return ssp;
    }

    @JsonProperty("SSP")
    public void setSsp(Double ssp) {
        this.ssp = ssp;
    }

    @JsonProperty("STD")
    public Integer getStd() {
        return std;
    }

    @JsonProperty("STD")
    public void setStd(Integer std) {
        this.std = std;
    }

    @JsonProperty("STN")
    public Double getStn() {
        return stn;
    }

    @JsonProperty("STN")
    public void setStn(Double stn) {
        this.stn = stn;
    }

    @JsonProperty("SVC")
    public Double getSvc() {
        return svc;
    }

    @JsonProperty("SVC")
    public void setSvc(Double svc) {
        this.svc = svc;
    }

    @JsonProperty("SYP")
    public Double getSyp() {
        return syp;
    }

    @JsonProperty("SYP")
    public void setSyp(Double syp) {
        this.syp = syp;
    }

    @JsonProperty("SZL")
    public Double getSzl() {
        return szl;
    }

    @JsonProperty("SZL")
    public void setSzl(Double szl) {
        this.szl = szl;
    }

    @JsonProperty("THB")
    public Double getThb() {
        return thb;
    }

    @JsonProperty("THB")
    public void setThb(Double thb) {
        this.thb = thb;
    }

    @JsonProperty("TJS")
    public Double getTjs() {
        return tjs;
    }

    @JsonProperty("TJS")
    public void setTjs(Double tjs) {
        this.tjs = tjs;
    }

    @JsonProperty("TMT")
    public Double getTmt() {
        return tmt;
    }

    @JsonProperty("TMT")
    public void setTmt(Double tmt) {
        this.tmt = tmt;
    }

    @JsonProperty("TND")
    public Double getTnd() {
        return tnd;
    }

    @JsonProperty("TND")
    public void setTnd(Double tnd) {
        this.tnd = tnd;
    }

    @JsonProperty("TOP")
    public Double getTop() {
        return top;
    }

    @JsonProperty("TOP")
    public void setTop(Double top) {
        this.top = top;
    }

    @JsonProperty("TRY")
    public Double getTry() {
        return _try;
    }

    @JsonProperty("TRY")
    public void setTry(Double _try) {
        this._try = _try;
    }

    @JsonProperty("TTD")
    public Double getTtd() {
        return ttd;
    }

    @JsonProperty("TTD")
    public void setTtd(Double ttd) {
        this.ttd = ttd;
    }

    @JsonProperty("TWD")
    public Double getTwd() {
        return twd;
    }

    @JsonProperty("TWD")
    public void setTwd(Double twd) {
        this.twd = twd;
    }

    @JsonProperty("TZS")
    public Integer getTzs() {
        return tzs;
    }

    @JsonProperty("TZS")
    public void setTzs(Integer tzs) {
        this.tzs = tzs;
    }

    @JsonProperty("UAH")
    public Double getUah() {
        return uah;
    }

    @JsonProperty("UAH")
    public void setUah(Double uah) {
        this.uah = uah;
    }

    @JsonProperty("UGX")
    public Double getUgx() {
        return ugx;
    }

    @JsonProperty("UGX")
    public void setUgx(Double ugx) {
        this.ugx = ugx;
    }

    @JsonProperty("USD")
    public Integer getUsd() {
        return usd;
    }

    @JsonProperty("USD")
    public void setUsd(Integer usd) {
        this.usd = usd;
    }

    @JsonProperty("UYU")
    public Double getUyu() {
        return uyu;
    }

    @JsonProperty("UYU")
    public void setUyu(Double uyu) {
        this.uyu = uyu;
    }

    @JsonProperty("UZS")
    public Double getUzs() {
        return uzs;
    }

    @JsonProperty("UZS")
    public void setUzs(Double uzs) {
        this.uzs = uzs;
    }

    @JsonProperty("VES")
    public Double getVes() {
        return ves;
    }

    @JsonProperty("VES")
    public void setVes(Double ves) {
        this.ves = ves;
    }

    @JsonProperty("VND")
    public Integer getVnd() {
        return vnd;
    }

    @JsonProperty("VND")
    public void setVnd(Integer vnd) {
        this.vnd = vnd;
    }

    @JsonProperty("VUV")
    public Double getVuv() {
        return vuv;
    }

    @JsonProperty("VUV")
    public void setVuv(Double vuv) {
        this.vuv = vuv;
    }

    @JsonProperty("WST")
    public Double getWst() {
        return wst;
    }

    @JsonProperty("WST")
    public void setWst(Double wst) {
        this.wst = wst;
    }

    @JsonProperty("XAF")
    public Double getXaf() {
        return xaf;
    }

    @JsonProperty("XAF")
    public void setXaf(Double xaf) {
        this.xaf = xaf;
    }

    @JsonProperty("XAG")
    public Double getXag() {
        return xag;
    }

    @JsonProperty("XAG")
    public void setXag(Double xag) {
        this.xag = xag;
    }

    @JsonProperty("XAU")
    public Double getXau() {
        return xau;
    }

    @JsonProperty("XAU")
    public void setXau(Double xau) {
        this.xau = xau;
    }

    @JsonProperty("XCD")
    public Double getXcd() {
        return xcd;
    }

    @JsonProperty("XCD")
    public void setXcd(Double xcd) {
        this.xcd = xcd;
    }

    @JsonProperty("XDR")
    public Double getXdr() {
        return xdr;
    }

    @JsonProperty("XDR")
    public void setXdr(Double xdr) {
        this.xdr = xdr;
    }

    @JsonProperty("XOF")
    public Double getXof() {
        return xof;
    }

    @JsonProperty("XOF")
    public void setXof(Double xof) {
        this.xof = xof;
    }

    @JsonProperty("XPD")
    public Double getXpd() {
        return xpd;
    }

    @JsonProperty("XPD")
    public void setXpd(Double xpd) {
        this.xpd = xpd;
    }

    @JsonProperty("XPF")
    public Double getXpf() {
        return xpf;
    }

    @JsonProperty("XPF")
    public void setXpf(Double xpf) {
        this.xpf = xpf;
    }

    @JsonProperty("XPT")
    public Double getXpt() {
        return xpt;
    }

    @JsonProperty("XPT")
    public void setXpt(Double xpt) {
        this.xpt = xpt;
    }

    @JsonProperty("YER")
    public Double getYer() {
        return yer;
    }

    @JsonProperty("YER")
    public void setYer(Double yer) {
        this.yer = yer;
    }

    @JsonProperty("ZAR")
    public Double getZar() {
        return zar;
    }

    @JsonProperty("ZAR")
    public void setZar(Double zar) {
        this.zar = zar;
    }

    @JsonProperty("ZMW")
    public Double getZmw() {
        return zmw;
    }

    @JsonProperty("ZMW")
    public void setZmw(Double zmw) {
        this.zmw = zmw;
    }

    @JsonProperty("ZWL")
    public Integer getZwl() {
        return zwl;
    }

    @JsonProperty("ZWL")
    public void setZwl(Integer zwl) {
        this.zwl = zwl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
