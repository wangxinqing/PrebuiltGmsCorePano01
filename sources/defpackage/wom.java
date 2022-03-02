package defpackage;

import android.content.Context;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

/* renamed from: wom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wom extends wnc {
    private final String b;
    private final String c;
    private final String d;
    private final List e;
    private final int f;
    private final boolean g;
    private final long s;
    private final String t;
    private final int u;
    private final int v;
    private final int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wom(String str, int i, wzv wzv, String str2, String str3, String str4, List list, int i2, boolean z, long j, String str5, int i3, int i4, int i5) {
        super(str, i, wzv, str2, "LoadPeople");
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = i2;
        this.g = z;
        this.s = j;
        this.t = str5;
        this.u = i3;
        this.v = i4;
        this.w = i5;
    }

    public final DataHolder d(Context context) {
        return wop.a(context, this.b, this.c, this.d, this.e, this.f, this.g, this.s, this.t, this.u, this.w, this.v, false);
    }
}
