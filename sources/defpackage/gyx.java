package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;

/* renamed from: gyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gyx {
    public static Intent a(Context context) {
        return IntentOperation.getStartIntent(context, "com.google.android.gms.checkin.CheckinIntentOperation", "com.google.android.gms.checkin.CHECKIN_START_ACTION");
    }

    public static Intent a(Context context, Bundle bundle) {
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.checkin.CheckinIntentOperation", "com.google.android.gms.checkin.CHECKIN_START_ACTION");
        startIntent.putExtra("config_flags_bundle", bundle);
        return startIntent;
    }
}
