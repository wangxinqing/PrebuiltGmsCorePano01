package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.scheduler.execution.TaskExecutionDelegator$TaskCompletingReceiver;
import java.util.List;

/* renamed from: aacr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aacr {
    private final ntv a;
    private final aacp b;

    public aacr(ntv ntv, aacp aacp) {
        this.a = ntv;
        this.b = aacp;
    }

    private final acwa a(aabx aabx) {
        aacp aacp = this.b;
        acwd acwd = new acwd();
        aacp.e.execute(new aacg(aacp, aabx, acwd));
        return acwd.a;
    }

    public static boolean a(int i) {
        return ((i + -1) & i) == 0 && (i & 3724) > 0;
    }

    public static boolean b(int i) {
        return i == 1;
    }

    public final synchronized acwa a(Context context, aabx aabx) {
        acwa acwa;
        Intent intent;
        if (!aaaz.b(aabx.a)) {
            String valueOf = String.valueOf(aabx.a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("Running in whitelist mode. Ignoring task: ");
            sb.append(valueOf);
            Log.w("NetworkScheduler.TED", sb.toString());
            return acws.a((Object) 2);
        }
        if (aabx.a.q()) {
            aabx.a.c();
        }
        int k = aabx.k();
        PackageManager c = this.a.c(k);
        if (c == null) {
            return acws.a((Object) 4);
        } else if (aabx.g()) {
            if (k != 0) {
                Intent i = aabx.i();
                List<ResolveInfo> queryBroadcastReceivers = c.queryBroadcastReceivers(i, 0);
                if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() != 1) {
                    int k2 = aabx.k();
                    StringBuilder sb2 = new StringBuilder(91);
                    sb2.append("Failed to schedule task for user: ");
                    sb2.append(k2);
                    sb2.append(". Can't find correct gmscore internal receiver");
                    Log.e("NetworkScheduler.TED", sb2.toString());
                    acwa = acws.a((Object) Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
                } else {
                    try {
                        if (!aabx.b()) {
                            acwd acwd = new acwd();
                            nqw.a(context, aabx.k(), i, "com.google.android.gms.permission.INTERNAL_BROADCAST", new TaskExecutionDelegator$TaskCompletingReceiver(acwd), (Handler) null);
                            acwa = acwd.a;
                        } else {
                            acwa = a(aabx);
                        }
                    } catch (IllegalStateException e) {
                        String valueOf2 = String.valueOf(aabx.a.f());
                        int k3 = aabx.k();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 80);
                        sb3.append("Couldn't bind to service: ");
                        sb3.append(valueOf2);
                        sb3.append(" on user ");
                        sb3.append(k3);
                        sb3.append(". Are you using an up-to-date SDK?");
                        Log.e("NetworkScheduler.TED", sb3.toString());
                        acwa = acws.a((Object) 64);
                    }
                }
            } else {
                ComponentName componentName = null;
                if (!aabx.c()) {
                    intent = aabx.j();
                    if (intent == null) {
                        String valueOf3 = String.valueOf((Object) null);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 37);
                        sb4.append("Invalid service definition provided: ");
                        sb4.append(valueOf3);
                        Log.e("NetworkScheduler.TED", sb4.toString());
                        acwa = acws.a((Object) 32);
                    }
                } else {
                    intent = null;
                }
                try {
                    if (!aabx.b()) {
                        iva.a((Object) intent);
                        componentName = context.startService(intent);
                        if (componentName == null) {
                            String valueOf4 = String.valueOf(intent);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 24);
                            sb5.append("Couldn't start service: ");
                            sb5.append(valueOf4);
                            Log.e("NetworkScheduler.TED", sb5.toString());
                            acwa = acws.a((Object) 128);
                        } else {
                            acwa = acws.a((Object) 1);
                        }
                    } else {
                        acwa = a(aabx);
                    }
                } catch (RuntimeException e2) {
                    if (!(e2.getCause() instanceof TransactionTooLargeException)) {
                        throw e2;
                    }
                } catch (SecurityException e3) {
                    String valueOf5 = String.valueOf(intent);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 61);
                    sb6.append("Couldn't start service: ");
                    sb6.append(valueOf5);
                    sb6.append(". Are your permissions set correctly?");
                    Log.e("NetworkScheduler.TED", sb6.toString());
                    acwa = acws.a((Object) 8);
                } catch (IllegalStateException e4) {
                    String valueOf6 = String.valueOf(aabx.a.f());
                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf6).length() + 60);
                    sb7.append("Couldn't bind to Service: ");
                    sb7.append(valueOf6);
                    sb7.append(". Are you using an up-to-date SDK?");
                    Log.e("NetworkScheduler.TED", sb7.toString());
                    acwa = acws.a((Object) 64);
                }
            }
            acwa.a((acvp) new aacq(aabx));
            return acwa;
        } else {
            return acws.a((Object) 32);
        }
    }

    public final boolean a(aabx aabx, int i) {
        boolean z;
        aaco a2;
        boolean z2 = true;
        if (aabx.b()) {
            aacp aacp = this.b;
            synchronized (aacp.a) {
                aacm aacm = (aacm) aacp.b.get(new aacn(aabx));
                if (aacm != null) {
                    synchronized (aacm.h.a) {
                        try {
                            a2 = aacm.a(aabx.a.e());
                            if (a2 == null) {
                                if (aacm.a.isEmpty()) {
                                    aacm.close();
                                }
                            } else if (aacm.d == null) {
                                a2.a.b((Object) 2048);
                                if (aacm.a.isEmpty()) {
                                    aacm.close();
                                }
                            } else {
                                Message a3 = aacm.a(aacm.a(a2), 2);
                                a3.arg1 = qxy.a(i);
                                nsy nsy = aacm.d;
                                if (nsy != null) {
                                    nsy.a(a3);
                                    if (aacm.a.isEmpty()) {
                                        aacm.close();
                                    }
                                    z = true;
                                } else if (aacm.a.isEmpty()) {
                                    aacm.close();
                                }
                            }
                        } catch (RemoteException e) {
                            String valueOf = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                            sb.append("error timing out task: ");
                            sb.append(valueOf);
                            Log.e("NetworkScheduler.TED", sb.toString());
                            a2.a.b((Object) 2048);
                            if (aacm.a.isEmpty()) {
                                aacm.close();
                            }
                        } catch (Throwable th) {
                            if (aacm.a.isEmpty()) {
                                aacm.close();
                            }
                            throw th;
                        }
                    }
                }
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        aabx.b(i);
        return z2;
    }
}
