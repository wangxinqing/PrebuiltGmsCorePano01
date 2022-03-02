package defpackage;

import android.app.usage.UsageStatsManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.UserHandle;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.broadcast.BackgroundBroadcastReceiverSupport$GmsReceiverIntentOperation;
import com.google.android.gms.common.broadcast.BackgroundBroadcastReceiverSupport$PersistentReceiverIntentOperation;
import com.google.android.gms.common.broadcast.BackgroundBroadcastReceiverSupport$UiReceiverIntentOperation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ijs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ijs extends BroadcastReceiver {
    private final ijz a;
    private final ijr b = new ijr();

    public ijs(ijz ijz) {
        this.a = ijz;
    }

    private static final void a(Context context, Intent intent, SparseArray sparseArray, int i) {
        Class cls;
        if (sparseArray.get(i) != null) {
            if (i == 1) {
                cls = BackgroundBroadcastReceiverSupport$GmsReceiverIntentOperation.class;
            } else if (i == 2) {
                cls = BackgroundBroadcastReceiverSupport$PersistentReceiverIntentOperation.class;
            } else if (i == 4) {
                cls = BackgroundBroadcastReceiverSupport$UiReceiverIntentOperation.class;
            } else {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Process ");
                sb.append(i);
                sb.append(" has no IntentOperationService.");
                throw new IllegalArgumentException(sb.toString());
            }
            Intent startIntent = IntentOperation.getStartIntent(context, cls, "com.google.android.gms.common.broadcast.DELIVER_BROADCAST");
            if (startIntent == null) {
                String valueOf = String.valueOf(intent.getAction());
                Log.e("GmsReceiverSupport", valueOf.length() == 0 ? new String("Failure to create IntentOperation for broadcast: ") : "Failure to create IntentOperation for broadcast: ".concat(valueOf));
                return;
            }
            startIntent.putExtra("broadcast_intent", intent);
            List<iye> list = (List) sparseArray.get(i);
            String[] strArr = new String[list.size()];
            int i2 = 0;
            for (iye iye : list) {
                strArr[i2] = iye.a;
                i2++;
            }
            startIntent.putExtra("broadcast_targets", strArr);
            try {
                context.startService(startIntent);
            } catch (IllegalStateException e) {
                try {
                    ((UsageStatsManager) context.getSystemService("usagestats")).whitelistAppTemporarily("com.google.android.gms", 60000, UserHandle.getUserHandleForUid(Process.myUid()));
                    try {
                        context.startService(startIntent);
                    } catch (IllegalStateException e2) {
                        Log.e("GmsReceiverSupport", "com.google.android.gms requires <allow-in-power-save> exemption in /system/etc/sysconfig/google.xml for core device features to function.", e2);
                    }
                } catch (SecurityException e3) {
                    Log.e("GmsReceiverSupport", "com.google.android.gms requires <allow-in-power-save> exemption in /system/etc/sysconfig/google.xml for core device features to function.", e3);
                }
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        if (intent != null && intent.getPackage() == null && intent.getComponent() == null) {
            if ("android.intent.action.DROPBOX_ENTRY_ADDED".equals(intent.getAction())) {
                ijr ijr = this.b;
                if ("android.intent.action.DROPBOX_ENTRY_ADDED".equals(intent.getAction()) && awxi.a.a().a()) {
                    String stringExtra = intent.getStringExtra("tag");
                    if ((awxi.a.a().c() || !ijr.a.contains(stringExtra)) && !ijr.b.a()) {
                        String valueOf = String.valueOf(intent);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                        sb.append("intent throttled: ");
                        sb.append(valueOf);
                        Log.w("GmsReceiverSupport", sb.toString());
                        return;
                    }
                }
            }
            ijz ijz = this.a;
            ArrayList arrayList = new ArrayList();
            Map map = ijz.a;
            if (map != null) {
                for (ijy ijy : map.values()) {
                    int match = ijy.a.match((ContentResolver) null, intent, false, "ReceiverRegistry");
                    if (match > 0 && (match & 268435455) > 0) {
                        arrayList.addAll(ijy.c);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                iye iye = (iye) arrayList.get(i2);
                int i3 = iye.b;
                if (i3 != 0) {
                    i = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? 0 : 6 : 5 : 4 : 3;
                } else {
                    i = 2;
                }
                if (i == 0) {
                    i = 1;
                }
                int i4 = i - 2;
                if (i4 == 1) {
                    arrayList2.add(iye);
                } else if (i4 == 2 || i4 == 3) {
                    arrayList3.add(iye);
                } else if (i4 != 4) {
                    String valueOf2 = String.valueOf(iye.a);
                    throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Unknown process used for: ") : "Unknown process used for: ".concat(valueOf2));
                } else {
                    arrayList4.add(iye);
                }
            }
            SparseArray sparseArray = new SparseArray(3);
            ijz.a(sparseArray, 1, arrayList2);
            ijz.a(sparseArray, 2, arrayList3);
            ijz.a(sparseArray, 4, arrayList4);
            a(context, intent, sparseArray, 1);
            a(context, intent, sparseArray, 2);
            a(context, intent, sparseArray, 4);
        }
    }
}
