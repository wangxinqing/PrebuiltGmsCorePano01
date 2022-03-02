package defpackage;

/* renamed from: baou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class baou {
    public final azxi a;
    public final azxh b;

    protected baou(azxi azxi, azxh azxh) {
        amrl.a((Object) azxi, (Object) "channel");
        this.a = azxi;
        amrl.a((Object) azxh, (Object) "callOptions");
        this.b = azxh;
    }

    public final baou a(azxg azxg, Object obj) {
        return a(this.a, this.b.a(azxg, obj));
    }

    public abstract baou a(azxi azxi, azxh azxh);
}
