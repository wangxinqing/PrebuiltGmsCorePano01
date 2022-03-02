package defpackage;

/* renamed from: altv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class altv extends altw {
    public altv(altx altx) {
        super(altx);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(alsk alsk) {
        return alsk != null ? alsk.b(this) : "null";
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object b(alsk alsk) {
        String f = alsk.f();
        String d = alsk.d();
        StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 4 + String.valueOf(d).length());
        sb.append("<");
        sb.append(f);
        sb.append(": ");
        sb.append(d);
        sb.append(">");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(amic amic) {
        StringBuilder sb = new StringBuilder();
        alsc.a(amic, new alzd(sb));
        return sb.toString();
    }
}
