package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: qrg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qrg {
    public final SharedPreferences a;
    public final Object b = new Object();

    public qrg(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final Long a() {
        return Long.valueOf(this.a.getLong("index_built_until_state", 0));
    }

    public final void b() {
        this.a.edit().clear().commit();
    }

    public final void c() {
        this.a.edit().putStringSet("batch_indexing_windows", new HashSet()).commit();
    }

    public final void d() {
        b();
        this.a.edit().putLong("index_built_until_state", 0).putBoolean("audio_media_files_indexing_enabled", axvz.e()).putBoolean("id_based_mediastore_indexing_enabled", axvz.h()).commit();
    }

    public final Set a(String str) {
        Set<String> stringSet = this.a.getStringSet(str, new HashSet());
        HashSet hashSet = new HashSet();
        for (String c : stringSet) {
            List c2 = amsk.a(' ').c(c);
            if (c2.size() == 2) {
                hashSet.add(new qrf(Long.valueOf((String) c2.get(0)), Long.valueOf((String) c2.get(1))));
            }
        }
        return hashSet;
    }

    public final void a(long j) {
        this.a.edit().putLong("index_built_until_state", j).commit();
    }

    public final void a(qrf qrf) {
        synchronized (this.b) {
            Set<String> stringSet = this.a.getStringSet("batch_indexing_windows", new HashSet());
            stringSet.add(qrf.toString());
            this.a.edit().putStringSet("batch_indexing_windows", stringSet).commit();
        }
    }
}
