package defpackage;

import java.util.List;

/* renamed from: altm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class altm extends altj {
    public final int d;
    public final String e;

    public altm(alsk alsk, alss alss, List list, int i, String str) {
        super(alsk, alss, list);
        this.d = i;
        this.e = str;
    }

    public final altj a(alsk alsk) {
        return new altm(alsk, this.b, this.c, this.d, this.e);
    }
}
