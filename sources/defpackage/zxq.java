package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.SourceStats;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: zxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zxq {
    public static final zsg d = zsg.a("CRSModel");
    public final SharedPreferences a;
    public String b;
    public final Map c = new HashMap();
    private final Set e;

    public zxq(SharedPreferences sharedPreferences, Set set) {
        this.a = sharedPreferences;
        this.e = set;
    }

    /* access modifiers changed from: protected */
    public final zyi a(BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity) {
        if (backedUpContactsPerDeviceEntity.c() == null) {
            return null;
        }
        zyh zyh = new zyh(backedUpContactsPerDeviceEntity.a, backedUpContactsPerDeviceEntity.c);
        if (azfh.c()) {
            zyh.b = backedUpContactsPerDeviceEntity.b;
        }
        zyh.k = null;
        for (SourceStats sourceStats : backedUpContactsPerDeviceEntity.c()) {
            if (azfa.b()) {
                if (!this.e.contains(sourceStats.a()) || TextUtils.equals("com.google", sourceStats.a())) {
                    zyh.a(sourceStats);
                }
            } else if (!aekr.a(sourceStats.a()) || TextUtils.equals("com.google", sourceStats.a())) {
                zyh.a(sourceStats);
            }
        }
        zyh.d = backedUpContactsPerDeviceEntity.d.longValue();
        if (!azfh.e()) {
            zyh.e = backedUpContactsPerDeviceEntity.e.longValue();
        }
        return zyh.a();
    }

    public final Map b(String str) {
        return (Map) this.c.get(str);
    }

    public final void a(String str) {
        if (str == null || zyk.a(str)) {
            this.b = str;
        }
    }
}
