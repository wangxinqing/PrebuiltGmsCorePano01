package defpackage;

import android.content.Context;
import com.google.android.gms.drive.internal.OnPinnedDownloadPreferencesResponse;
import com.google.android.gms.drive.internal.ParcelableTransferPreferences;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kge extends kfa {
    public kge(kec kec, kwg kwg) {
        super("GetPinnedDownloadPreferencesOperation", kec, kwg, "378076965553");
    }

    public final Set a() {
        return EnumSet.allOf(jzl.class);
    }

    public final void c(Context context) {
        int i;
        boolean a = lsm.a().g.a();
        kaa kaa = new kaa();
        if (!a) {
            i = 1;
        } else {
            i = 2;
        }
        kaa.b = i;
        this.b.a(new OnPinnedDownloadPreferencesResponse(new ParcelableTransferPreferences(kaa.a())));
    }
}
