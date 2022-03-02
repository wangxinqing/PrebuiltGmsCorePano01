package defpackage;

import android.content.Context;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.util.concurrent.Callable;

/* renamed from: zxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class zxm implements Callable {
    private final ContactsRestoreSettingsChimeraActivity a;
    private final String b;
    private final Long c;

    public zxm(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity, String str, Long l) {
        this.a = contactsRestoreSettingsChimeraActivity;
        this.b = str;
        this.c = l;
    }

    public final Object call() {
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = this.a;
        String str = this.b;
        Long l = this.c;
        Context applicationContext = contactsRestoreSettingsChimeraActivity.getApplicationContext();
        long longValue = l.longValue();
        if (jlj.a()) {
            zsf.a.d("SharedPreference being modified on main thread - setRestoreFromSettings()");
        }
        return Boolean.valueOf(zyk.b(applicationContext).edit().putLong(str, longValue).commit());
    }
}
