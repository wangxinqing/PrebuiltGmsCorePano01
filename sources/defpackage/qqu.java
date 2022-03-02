package defpackage;

import java.util.List;

/* renamed from: qqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qqu implements amqy {
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        List<Boolean> list = (List) obj;
        if (list == null) {
            return false;
        }
        Boolean bool = true;
        for (Boolean booleanValue : list) {
            bool = Boolean.valueOf(bool.booleanValue() & booleanValue.booleanValue());
        }
        return bool;
    }
}
