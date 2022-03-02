package defpackage;

import java.util.Locale;

/* renamed from: lef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lef extends lec {
    private String a = null;
    private boolean b = false;

    public lef(ldz ldz) {
        super(ldz);
    }

    public final String a() {
        iva.a(this.b, (Object) "Must not call this method before finish()");
        return this.a;
    }

    public final String toString() {
        return String.format(Locale.US, "NextFeedMonitorProcessor[%s]", new Object[]{super.toString()});
    }

    public final void a(String str) {
        iva.a(!this.b, (Object) "Already finished. Did you delegate from more than one FeedProcessor to this one?");
        this.a = str;
        this.b = true;
        super.a(str);
    }
}
