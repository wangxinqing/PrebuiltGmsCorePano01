package defpackage;

import android.content.SharedPreferences;
import java.util.List;

/* renamed from: afoc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afoc implements aoqb {
    private final afpf a;
    private final SharedPreferences b;

    public afoc(afpf afpf, SharedPreferences sharedPreferences) {
        this.a = afpf;
        this.b = sharedPreferences;
    }

    public final aorr a(Object obj) {
        afpf afpf = this.a;
        SharedPreferences sharedPreferences = this.b;
        for (aflf aflf : (List) obj) {
            if ((aflf.a & 8) == 0) {
                if (afpf.d.b(aflf)) {
                    String str = aflf.b;
                    Object[] objArr = {"FileGroupManager", str, aflf.c};
                    afpf.b.a(1061, str, -1);
                } else {
                    afsh.a("%s: Unable to remove GroupKeys with downloaded field not set.", (Object) "FileGroupManager");
                    return aorl.a((Object) null);
                }
            }
        }
        if (!sharedPreferences.edit().putBoolean("done_remove_groupkeys_with_downloaded_field_not_set", true).commit()) {
            afsh.a("%s: Unable to save the state of removing GroupKeys with downloaded field not set", (Object) "FileGroupManager");
        }
        return aorl.a((Object) null);
    }
}
