package defpackage;

import java.util.Arrays;

/* renamed from: alts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alts {
    private final alsk a;
    private final alsk b;

    public alts(alsk alsk, alsk alsk2) {
        this.a = alsk;
        this.b = alsk2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof alts)) {
            return false;
        }
        alts alts = (alts) obj;
        alsk alsk = this.a;
        alsk alsk2 = alts.a;
        if ((alsk == alsk2 && this.b == alts.b) || (alsk == alts.b && this.b == alsk2)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int identityHashCode = System.identityHashCode(this.a);
        int identityHashCode2 = System.identityHashCode(this.b);
        if (identityHashCode < identityHashCode2) {
            return Arrays.hashCode(new Object[]{Integer.valueOf(identityHashCode), Integer.valueOf(identityHashCode2)});
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(identityHashCode2), Integer.valueOf(identityHashCode)});
    }
}
