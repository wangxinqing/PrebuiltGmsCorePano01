package com.google.android.chimera;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import com.google.android.chimera.config.InvalidConfigException;
import java.util.ArrayList;
import java.util.List;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class IntentOperation extends ContextWrapper {
    public static final String ACTION_NEW_MODULE = "com.google.android.chimera.IntentOperation.NEW_MODULE";
    public static final String ACTION_TARGETED_INTENT = "com.google.android.chimera.IntentOperation.TARGETED_INTENT";
    private static ComponentName CM = null;
    public static final String EXTRA_CONTAINER_UPDATED = "containerUpdated";
    public static final String EXTRA_PREVIOUS_VERSION = "oldversion";
    public static final String EXTRA_TARGETED_INTENT = "targetedIntent";

    public IntentOperation() {
        super((Context) null);
    }

    private static brx a(Context context, Intent intent, String str) {
        Intent intent2 = intent;
        String action = intent.getAction();
        amrl.a((Object) action);
        try {
            apxg f = bkv.a(context).f().f();
            String F = f.F();
            String a = brt.a(F, str);
            String a2 = brt.a(F, action);
            int E = f.E();
            brv brv = new brv();
            for (int i = 0; i < E; i++) {
                f.a(brv, i);
                apxg a3 = brv.a(a2);
                if (a3 != null) {
                    int C = a3.C();
                    brx brx = new brx();
                    for (int i2 = 0; i2 < C; i2++) {
                        a3.a(brx, i2);
                        if (brx.f().equals(a)) {
                            intent2.setClassName(context, brt.b(F, brv.U()));
                            String valueOf = String.valueOf(a);
                            intent2.addCategory(valueOf.length() == 0 ? new String("targeted_intent_op_prefix:") : "targeted_intent_op_prefix:".concat(valueOf));
                            return brx;
                        }
                        Context context2 = context;
                    }
                    continue;
                }
                Context context3 = context;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 46 + String.valueOf(a2).length());
            sb.append("No such module intent operation: ");
            sb.append(a);
            sb.append(" for action: ");
            sb.append(a2);
            Log.e("IntentOperation", sb.toString());
            return null;
        } catch (InvalidConfigException e) {
            String valueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
            sb2.append("Failed to get Chimera config:");
            sb2.append(valueOf2);
            Log.w("IntentOperation", sb2.toString());
            return null;
        }
    }

    public static Intent getExternalIntent(Intent intent) {
        return new Intent("com.google.android.chimera.container.IntentOperationService.EXTERNAL_INTENT").putExtra("intent", intent);
    }

    public static Intent getModuleSpecificIntent(String str, Intent intent) {
        return new Intent("com.google.android.chimera.container.IntentOperationService.MODULE_SPECIFIC").putExtra("moduleid", str).putExtra("intent", intent);
    }

    public static PendingIntent getPendingIntent(Context context, Class cls, Intent intent, int i, int i2) {
        return getPendingIntent(context, cls.getName(), intent, i, i2);
    }

    public static Intent getStartIntent(Context context, Class cls, String str) {
        return getStartIntent(context, cls.getName(), str);
    }

    public static List getStartIntentsForBroadcast(Context context, Intent intent, boolean z, boolean z2) {
        String action = intent.getAction();
        amtf.a((Object) action);
        try {
            apxg f = bkv.a(context).f().f();
            String F = f.F();
            String a = brt.a(F, action);
            int E = f.E();
            ArrayList arrayList = new ArrayList(E);
            brv brv = new brv();
            for (int i = 0; i < E; i++) {
                f.a(brv, i);
                apxg a2 = brv.a(a);
                if (a2 != null) {
                    String b = brt.b(F, brv.U());
                    boolean z3 = !z;
                    int C = a2.C();
                    brx brx = new brx();
                    int i2 = 0;
                    boolean z4 = false;
                    boolean z5 = false;
                    while (true) {
                        if (i2 >= C) {
                            break;
                        }
                        a2.a(brx, i2);
                        if (!z2 || brx.j()) {
                            z3 |= brx.i();
                            z4 |= brx.h();
                            if (z3 && z4) {
                                z5 = true;
                                break;
                            }
                            z5 = true;
                        }
                        i2++;
                    }
                    if (!z5) {
                        Context context2 = context;
                        Intent intent2 = intent;
                    } else if (z && !z3) {
                        Context context3 = context;
                        Intent intent3 = intent;
                    } else {
                        Intent intent4 = new Intent(intent);
                        if (z) {
                            intent4 = getExternalIntent(intent4);
                        }
                        if (z4) {
                            intent4 = getWakefulIntent(intent4);
                        }
                        intent4.setClassName(context, b);
                        arrayList.add(intent4);
                    }
                } else {
                    Context context4 = context;
                    Intent intent5 = intent;
                }
            }
            return arrayList;
        } catch (InvalidConfigException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Failed to get Chimera config: ");
            sb.append(valueOf);
            Log.w("IntentOperation", sb.toString());
            return null;
        }
    }

    public static Intent getWakefulIntent(Intent intent) {
        return new Intent("com.google.android.chimera.container.IntentOperationService.WAKEFUL_INTENT").putExtra("intent", intent);
    }

    public static boolean startModuleIntentOperation(Context context, String str, Intent intent) {
        Intent moduleSpecificIntent = getModuleSpecificIntent(str, intent);
        ComponentName componentName = CM;
        if (componentName != null) {
            moduleSpecificIntent.setComponent(componentName);
        } else {
            moduleSpecificIntent.setPackage(context.getPackageName());
        }
        ComponentName startService = context.startService(moduleSpecificIntent);
        CM = startService;
        return startService != null;
    }

    public void init(Context context) {
        attachBaseContext(context);
        onCreate();
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public void onHandleIntent(Intent intent) {
    }

    public static PendingIntent getPendingIntent(Context context, String str, Intent intent, int i, int i2) {
        brx a = a(context, intent, str);
        String str2 = null;
        if (a == null) {
            return null;
        }
        if (!a.h()) {
            return PendingIntent.getService(context, i, intent, i2);
        }
        Intent wakefulIntent = getWakefulIntent(intent);
        wakefulIntent.setComponent(intent.getComponent());
        Intent intent2 = new Intent(ACTION_TARGETED_INTENT);
        intent2.putExtra(EXTRA_TARGETED_INTENT, wakefulIntent);
        String action = intent.getAction();
        if (action == null) {
            action = "null";
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            str2 = component.getClassName();
        }
        amtf.a((Object) str2);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("chimeraio").appendPath(str2).appendPath(action);
        intent2.setData(builder.build());
        intent2.setPackage(context.getPackageName());
        return PendingIntent.getBroadcast(context, i, intent2, i2);
    }

    public static Intent getStartIntent(Context context, String str, String str2) {
        Intent intent = new Intent(str2);
        if (a(context, intent, str) != null) {
            return intent;
        }
        return null;
    }

    public void onHandleIntent(Intent intent, boolean z) {
        onHandleIntent(intent);
    }
}
