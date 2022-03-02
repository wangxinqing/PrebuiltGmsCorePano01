package defpackage;

import android.content.Context;

/* renamed from: woy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class woy extends wpa {
    public final String a;
    private final boolean b;

    public woy(String str, int i, String str2, wmq wmq, boolean z, String str3) {
        super(str, i, wmq, str3, (byte[]) null);
        this.a = str2;
        this.b = z;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
        sb.append("[url=");
        sb.append(str);
        sb.append("]");
        sb.toString();
    }

    /* access modifiers changed from: protected */
    public byte[] d(Context context) {
        return wmz.a(context).a(this.a, this.b);
    }
}
