package defpackage;

/* renamed from: ahrp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahrp implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ahvw b;
    final /* synthetic */ ahrr c;

    public ahrp(ahrr ahrr, String str, ahvw ahvw) {
        this.c = ahrr;
        this.a = str;
        this.b = ahvw;
    }

    public final void run() {
        ahry ahry = this.c.a;
        String str = this.a;
        String ahvw = this.b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(ahvw).length());
        sb.append("File complete: ");
        sb.append(str);
        sb.append(" summary: ");
        sb.append(ahvw);
        sb.toString();
        ((ajcs) ahry).g++;
    }
}
