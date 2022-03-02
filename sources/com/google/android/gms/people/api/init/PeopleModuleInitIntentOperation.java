package com.google.android.gms.people.api.init;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.people.phenotype.RegisterPhenotypeOperation;
import com.google.android.gms.people.service.BackupAndSyncOptInValidationChimeraService;
import com.google.android.gms.people.service.DeletedNullContactsCleanupChimeraService;
import com.google.android.gms.people.sync.focus.ContactsSyncIntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeopleModuleInitIntentOperation extends hec {
    private static final String[] a = {"com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity"};

    private final void a() {
        int i;
        if (ayxh.k()) {
            if (ayxh.b()) {
                if ((System.currentTimeMillis() - wss.a((Context) this).a.getLong("deleted_null_contacts_cleanup_last_run_timestamp", 0)) / 1000 >= ayxh.a.a().g()) {
                    qxf qxf = new qxf();
                    qxf.i = "com.google.android.gms.people.service.DeletedNullContactsCleanupService";
                    qxf.k = "DeletedNullContactsCleanupOneoffTask";
                    int i2 = 2;
                    qxf.a(2);
                    qxf.b(1);
                    qxf.n = false;
                    qxf.a(0, ayxh.a.a().c());
                    boolean c = ayxh.c();
                    if (axcc.b() || ayxh.c()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    qxf.a(c ? 1 : 0, i);
                    qxf.a(ayxh.a.a().f());
                    try {
                        qwq.a((Context) this).a((qxx) qxf.b());
                    } catch (IllegalArgumentException e) {
                        Log.e("DeletedNullContactsCleanup", "Error when scheduling the oneoff task.", e);
                        i2 = 8;
                    }
                    wml a2 = wml.a();
                    aucd o = xlg.f.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xlg xlg = (xlg) o.b;
                    xlg.b = i2 - 1;
                    int i3 = xlg.a | 1;
                    xlg.a = i3;
                    xlg.e = 4;
                    xlg.a = i3 | 32;
                    a2.a((xlg) o.i());
                }
            }
            if (ayxh.f()) {
                DeletedNullContactsCleanupChimeraService.a((Context) this);
            } else {
                DeletedNullContactsCleanupChimeraService.c(this);
            }
        }
        if (!ayrn.i()) {
            return;
        }
        if (ayrn.d()) {
            BackupAndSyncOptInValidationChimeraService.a((Context) this);
        } else {
            BackupAndSyncOptInValidationChimeraService.c(this);
        }
    }

    private final void a(String str) {
        Intent startIntent = IntentOperation.getStartIntent((Context) this, RegisterPhenotypeOperation.class, "com.google.android.gms.people.phenotype.PHENOTYPE_REGISTER_ACTION");
        if (startIntent != null) {
            startIntent.putExtra("mendel_package_name", str);
            startService(startIntent);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        boolean z;
        int i2 = i & 4;
        int i3 = i & 8;
        if ((i & 2) != 0) {
            wss.a((Context) this).c(false);
            Intent startIntent = IntentOperation.getStartIntent((Context) this, ContactsSyncIntentOperation.class, "com.google.android.gms.people.sync.focus.contacts_sync_action");
            if (startIntent != null) {
                startService(startIntent);
            } else {
                Log.e("PeopleInitIntentOp", "Intent was not found: ContactsSyncIntentOperation");
            }
        }
        if (!(i3 == 0 && i2 == 0)) {
            jhg.d((Context) this);
            xej.a((Context) this).a(true);
            wtz.a((Context) this);
            if (ayrj.b()) {
                xwq.a(this);
            }
            if (!aysi.b()) {
                a();
            }
        }
        if (aysi.b()) {
            a();
        }
        if (i2 != 0) {
            for (String a2 : a) {
                jhg.a((Context) this, a2, true);
            }
        }
        a("com.google.android.gms.people");
        a("com.google.android.gms.people.ui");
        xip.a();
        if (((Boolean) xhw.a.a()).booleanValue()) {
            xip.a();
            z = ((Boolean) xhv.a.a()).booleanValue();
        } else {
            z = jgu.b(getApplicationContext());
        }
        if (z) {
            xip.a();
            ((Boolean) xhw.a.a()).booleanValue();
            if (Boolean.valueOf(ayrg.b()).booleanValue()) {
                wul a3 = wun.a();
                a3.a = "Android People Data Layer";
                a3.b = getString(R.string.people_settings_feedback_confirmation);
                a3.c = "com.google.social.graph.testing.uploader";
                a3.a(ayrg.b());
                a3.a(getApplicationContext());
            }
            if (Boolean.valueOf(ayrj.f()).booleanValue()) {
                wul a4 = wun.a();
                a4.a = "Focus Sync Adapter 2";
                a4.b = getString(R.string.people_settings_feedback_confirmation);
                a4.c = "com.google.social.graph.testing.uploader";
                a4.a(ayrj.f());
                a4.a((wuk) new wuz("com.google.android.gms.people"));
                a4.a((wuk) wui.a);
                a4.a((wuk) wui.b);
                a4.a((wuk) wui.c);
                a4.a((wuk) wui.d);
                a4.a((wuk) new wup());
                a4.a(getApplicationContext());
            }
            if (Boolean.valueOf(aywy.e()).booleanValue()) {
                wul a5 = wun.a();
                a5.a = "Menagerie";
                a5.b = getString(R.string.people_settings_feedback_confirmation);
                a5.c = "com.google.social.graph.testing.uploader";
                a5.a(aywy.e());
                a5.a((wuk) new wva("pluscontacts.db", "menagerie_db_compact", amzy.a("owners", "ac_people", "ac_container", "ac_item", "ac_index")));
                a5.a(getApplicationContext());
                return;
            }
            return;
        }
        Log.i("PeopleInitIntentOp", "Not initializing debuggability");
    }
}
