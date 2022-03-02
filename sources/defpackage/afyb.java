package defpackage;

import android.util.Log;

/* renamed from: afyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afyb implements afyc {
    private final Enum[] a;

    public afyb(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        amrl.a((Object) enumArr);
        amrl.a(enumArr.length > 0, (Object) "Event type must have at least one enum value!");
        this.a = enumArr;
    }

    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((Enum) obj).ordinal();
    }

    public final /* bridge */ /* synthetic */ Object a(Integer num) {
        if (num != null && num.intValue() >= 0) {
            int intValue = num.intValue();
            Enum[] enumArr = this.a;
            if (intValue < enumArr.length) {
                return enumArr[num.intValue()];
            }
        }
        String valueOf = String.valueOf(num);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Unknown event code ");
        sb.append(valueOf);
        sb.append("!");
        Log.e("SyncMetadata", sb.toString());
        return this.a[0];
    }
}
