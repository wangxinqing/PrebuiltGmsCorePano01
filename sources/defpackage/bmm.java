package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import java.util.Arrays;
import java.util.List;

/* renamed from: bmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bmm extends BroadcastReceiver {
    private final boolean b;
    private final String[] c;
    private final bnh d;

    public bmm(boolean z, String[] strArr, bnh bnh) {
        this.b = z;
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
        this.d = bnh;
    }

    private final boolean a(Context context, Intent intent) {
        ComponentName startService;
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.chimera.container.IntentOperationService.WAKEFUL_INTENT")) {
            context.startService(intent);
            return false;
        }
        bnh bnh = this.d;
        synchronized (bnh.c) {
            int i = bnh.a;
            bnh.a = i + 1;
            intent.putExtra("wakelockId", i);
            intent.putExtra("uniqueId", bnh.b);
            startService = context.startService(intent);
            if (startService != null) {
                bnh.c.put(i, bnh.a(context, startService.flattenToShortString(), 60000));
            } else {
                startService = null;
            }
        }
        return startService != null;
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z;
        String action = intent.getAction();
        if (action != null) {
            String[] strArr = this.c;
            if (strArr != null && Arrays.binarySearch(strArr, action) < 0) {
                String name = getClass().getName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 31 + action.length());
                sb.append(name);
                sb.append(" dropping unexpected broadcast ");
                sb.append(action);
                Log.w("IntentOpRcvr", sb.toString());
                return;
            }
            if (!action.equals(IntentOperation.ACTION_TARGETED_INTENT)) {
                List startIntentsForBroadcast = IntentOperation.getStartIntentsForBroadcast(context, intent, this.b, !aekv.b(context));
                if (startIntentsForBroadcast != null) {
                    int size = startIntentsForBroadcast.size();
                    z = false;
                    for (int i = 0; i < size; i++) {
                        z |= a(context, (Intent) startIntentsForBroadcast.get(i));
                    }
                } else {
                    String name2 = getClass().getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 39 + action.length());
                    sb2.append(name2);
                    sb2.append(" failed to resolve broadcast ");
                    sb2.append(action);
                    sb2.append(", dropping");
                    Log.w("IntentOpRcvr", sb2.toString());
                    return;
                }
            } else {
                Intent intent2 = (Intent) intent.getParcelableExtra(IntentOperation.EXTRA_TARGETED_INTENT);
                if (intent2 == null) {
                    Log.w("IntentOpRcvr", "Dropping com.google.android.chimera.IntentOperation.TARGETED_INTENT without inner intent extra");
                    intent2 = null;
                } else if (this.b) {
                    Log.w("IntentOpRcvr", "Exported receiver dropping com.google.android.chimera.IntentOperation.TARGETED_INTENT");
                    intent2 = null;
                } else {
                    try {
                        apxg f = bkv.a(context).f().f();
                        ComponentName component = intent2.getComponent();
                        amtf.a((Object) component);
                        String className = component.getClassName();
                        if (f.c(brt.a(f.F(), className)) == null) {
                            String valueOf = String.valueOf(className);
                            Log.w("IntentOpRcvr", valueOf.length() == 0 ? new String("Dropping com.google.android.chimera.IntentOperation.TARGETED_INTENT targeting invalid class ") : "Dropping com.google.android.chimera.IntentOperation.TARGETED_INTENT targeting invalid class ".concat(valueOf));
                            intent2 = null;
                        } else {
                            intent2.setPackage(context.getPackageName());
                        }
                    } catch (InvalidConfigException e) {
                        String valueOf2 = String.valueOf(e);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
                        sb3.append("Failed to get Chimera config: ");
                        sb3.append(valueOf2);
                        Log.e("IntentOpRcvr", sb3.toString());
                        intent2 = null;
                    }
                }
                if (intent2 != null) {
                    z = a(context, intent2);
                } else {
                    return;
                }
            }
            if (z) {
                bnh bnh = this.d;
                synchronized (bnh.c) {
                    bnh.e++;
                }
                Intent intent3 = new Intent("com.google.android.chimera.container.IntentOperationService.KEEPALIVE");
                intent3.putExtra("keepAliveDuration", 60000);
                intent3.setComponent(this.d.d);
                context.startService(intent3);
            }
        }
    }
}
