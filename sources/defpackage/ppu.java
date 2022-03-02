package defpackage;

import java.util.Comparator;
import java.util.Map;

/* renamed from: ppu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ppu implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.signum(((ppx) ((Map.Entry) obj2).getValue()).a - ((ppx) ((Map.Entry) obj).getValue()).a);
    }
}
