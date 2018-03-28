package com.xy.format.hbt212.coding;

import com.xy.format.hbt212.CodeMean;

/**
 * Created by xiaoyao9184 on 2018/3/26.
 */
public enum PollutionCode implements CodeMean {

    _B03("噪声","噪声","dB", "N3.1"),
    _L10("累计百分声级L10","噪声","dB","N3.1"),
    _L5("累计百分声级L5","噪声","dB","N3.1"),
    _L50("累计百分声级L50","噪声","dB","N3.1"),
    _L90("累计百分声计L90","噪声","dB","N3.1"),
    _L95("累计百分声级L95","噪声","dB","N3.1"),
    _Ld("夜间等效声级Ld","噪声","dB","N3.1"),
    _Ldn("昼夜等效声级Ldn","噪声","dB","N3.1"),
    _Leq("30秒等效声级Leq","噪声","dB","N3.1"),
    _LMn("最小的瞬时声级","噪声","dB","N3.1"),
    _LMx("最大的瞬时声级","噪声","dB","N3.1"),
    _Ln("昼间等效声级Ln","噪声","dB","N3.1"),
    _S01("O2 含量","废气","％","N3.1"),
    _S02("烟气流速","废气","m3/h","N5.2"),
    _S03("烟气温度","废气","℃","N3.1"),
    _S04("烟气动压","废气","MPa","N4.2"),
    _S05("烟气湿度","废气","%","N3.1"),
    _S06("制冷温度","废气","℃","N3.1"),
    _S07("烟道截面积","废气","M2","N4.2"),
    _S08("烟气压力","废气","MPa","N4.2"),
    _B02("废气"),
    _01("烟尘","废气","mg/m3","N5.2"),
    _02("二氧化硫","废气","mg/m3","N5.2"),
    _03("氮氧化物","废气","mg/m3","N5.3"),
    _04("一氧化碳","废气","mg/m3","N2.3"),
    _05("硫化氢","废气","mg/m3","N3.2"),
    _06("氟化物","废气","mg/m3","N2.3"),
    _07("氰化物(含氰化氢)","废气","mg/m3","N3.3"),
    _08("氯化氢","废气","mg/m3","N4.3"),
    _09("沥青烟","废气","mg/m3","N4.3"),
    _10("氨","废气","mg/m3","N4.3"),
    _11("氯气","废气","mg/m3","N4.3"),
    _12("二硫化碳","废气","mg/m3","N4.3"),
    _13("硫醇","废气","mg/m3","N4.3"),
    _14("硫酸雾","废气","mg/m3","N4.3"),
    _15("铬酸雾","废气","mg/m3","N2.4"),
    _16("苯系物","废气","mg/m3","N4.2"),
    _17("甲苯","废气","mg/m3","N4.2"),
    _18("二甲苯","废气","mg/m3","N4.2"),
    _19("甲醛","废气","mg/m3","N3.3"),
    _20("苯并(a)芘","废气","mg/m3","N3.6"),
    _21("苯胺类","废气","mg/m3","N4.3"),
    _22("硝基苯类","废气","mg/m3","N3.4"),
    _23("氯苯类","废气","mg/m3","N4.3"),
    _24("光气","废气","mg/m3","N3.3"),
    _25("碳氢化合物(含非甲烷总烃)","废气","mg/m3","N5.2"),
    _26("乙醛","废气","mg/m3","N3.4"),
    _27("酚类","废气","mg/m3","N3.3"),
    _28("甲醇","废气","mg/m3","N5.2"),
    _29("氯乙烯","废气","mg/m3","N4.3"),
    _30("二氧化碳","废气","mg/m3","N4.3"),
    _31("汞及其化合物","废气","mg/m3","N4.4"),
    _32("铅及其化合物","废气","mg/m3","N2.4"),
    _33("镉及其化合物","废气","mg/m3","N3.4"),
    _34("锡及其化合物","废气","mg/m3","N4.3"),
    _35("镍及其化合物","废气","mg/m3","N3.3"),
    _36("铍及其化合物","废气","mg/m3","N4.4"),
    _37("林格曼黑度","废气","N1",""),
    _99("其他气污染物","废气","",""),
    _B01("污水","污水","",""),
    _001("pH","值","污水","N2.1"),
    _002("色度","污水","色度单位","N5.1"),
    _003("悬浮物","污水","mg/l","N5.1"),
    _010("生化需氧量（BOD5）","污水","mg/l","N5.1"),
    _011("化学需氧量（CODcr）","污水","mg/l","N6.1"),
    _015("总有机碳","污水","mg/l","N3.2"),
    _020("总汞","污水","mg/l","N2.3"),
    _021("烷基汞","污水","mg/l","N2.1"),
    _022("总镉","污水","mg/l","N2.2"),
    _023("总铬","污水","mg/l","N3.2"),
    _024("六价铬","污水","mg/l","N2.2"),
    _025("三价铬","污水","mg/l","N3.2"),
    _026("总砷","污水","mg/l","N2.2"),
    _027("总铅","污水","mg/l","N3.2"),
    _028("总镍","污水","mg/l","N3.2"),
    _029("总铜","污水","mg/l","N3.2"),
    _030("总锌","污水","mg/l","N3.2"),
    _031("总锰","污水","mg/l","N3.2"),
    _032("总铁","污水","mg/l","N3.2"),
    _033("总银","污水","mg/l","N2.2"),
    _034("总铍","污水","mg/l","N2.3"),
    _035("总硒","污水","mg/l","N2.2"),
    _036("锡","污水","mg/l","N3.6"),
    _037("硼","污水","mg/l","N3.6"),
    _038("钼","污水","mg/l","N3.6"),
    _039("钡","污水","mg/l","N3.6"),
    _040("钴","污水","mg/l","N3.6"),
    _041("铊","污水","mg/l","N3.6"),
    _060("氨氮","污水","mg/l","N2.3"),
    _061("有机氮","污水","mg/l","N3.2"),
    _065("总氮","污水","mg/l","N3.2"),
    _080("石油类","污水","mg/l","N3.2"),
    _101("总磷","污水","mg/l","N3.2")
    ;

    private String code;
    private String meaning;
    private String scope;
    private String unit;
    private String type;

    PollutionCode(String meaning){
        this.code = name().substring(1);
        this.meaning = meaning;
    }

    PollutionCode(String meaning, String scope, String unit, String type){
        this.code = name().substring(1);
        this.meaning = meaning;
        this.scope = scope;
        this.unit = unit;
        this.type = type;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String mean() {
        return meaning;
    }

    public String scope() {
        return scope;
    }

    public String unit() {
        return unit;
    }
    public String type() {
        return type;
    }
}