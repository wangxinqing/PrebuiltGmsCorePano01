package defpackage;

/* renamed from: bagr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum bagr {
    NO_ERROR(0, babj.o),
    PROTOCOL_ERROR(1, babj.n),
    INTERNAL_ERROR(2, babj.n),
    FLOW_CONTROL_ERROR(3, babj.n),
    SETTINGS_TIMEOUT(4, babj.n),
    STREAM_CLOSED(5, babj.n),
    FRAME_SIZE_ERROR(6, babj.n),
    REFUSED_STREAM(7, babj.o),
    CANCEL(8, babj.c),
    COMPRESSION_ERROR(9, babj.n),
    CONNECT_ERROR(10, babj.n),
    ENHANCE_YOUR_CALM(11, babj.k.a("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, babj.i.a("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, babj.d);
    
    public static final bagr[] o = null;
    public final babj p;
    private final int q;

    static {
        int i;
        bagr[] values = values();
        bagr[] bagrArr = new bagr[(((int) values[r1 - 1].a()) + 1)];
        for (bagr bagr : values) {
            bagrArr[(int) bagr.a()] = bagr;
        }
        o = bagrArr;
    }

    private bagr(int i, babj babj) {
        this.q = i;
        String valueOf = String.valueOf(name());
        this.p = babj.b(valueOf.length() == 0 ? new String("HTTP/2 error code: ") : "HTTP/2 error code: ".concat(valueOf));
    }

    public final long a() {
        return (long) this.q;
    }
}
