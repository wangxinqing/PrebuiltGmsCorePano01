package defpackage;

/* renamed from: atyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atyn implements auco {
    CONSENT_FLOW_LAYOUT_UNSPECIFIED(0),
    MATERIAL_DESIGN(1),
    GLIF(2),
    OPA_GLIF(3),
    BOTTOM_SHEET(4),
    GLIF_V2(5),
    OPA_GLIF_V2(6),
    MATERIAL_DESIGN_V2(7);
    
    private final int i;

    private atyn(int i2) {
        this.i = i2;
    }

    public static atyn a(int i2) {
        switch (i2) {
            case 0:
                return CONSENT_FLOW_LAYOUT_UNSPECIFIED;
            case 1:
                return MATERIAL_DESIGN;
            case 2:
                return GLIF;
            case 3:
                return OPA_GLIF;
            case 4:
                return BOTTOM_SHEET;
            case 5:
                return GLIF_V2;
            case 6:
                return OPA_GLIF_V2;
            case 7:
                return MATERIAL_DESIGN_V2;
            default:
                return null;
        }
    }

    public static aucq b() {
        return atym.a;
    }

    public final int a() {
        return this.i;
    }

    public final String toString() {
        return Integer.toString(this.i);
    }
}
