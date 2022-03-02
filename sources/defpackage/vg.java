package defpackage;

import java.util.Comparator;

/* renamed from: vg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vg implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        vm vmVar = (vm) obj;
        vm vmVar2 = (vm) obj2;
        int i = vmVar.a - vmVar2.a;
        return i == 0 ? vmVar.b - vmVar2.b : i;
    }
}
