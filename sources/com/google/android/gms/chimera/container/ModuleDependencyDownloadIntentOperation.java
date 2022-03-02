package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleDependencyDownloadIntentOperation extends IntentOperation {
    static final Intent a = new Intent("com.google.android.finsky.BIND_PLAY_MODULE_SERVICE").setPackage("com.android.vending");
    private static final String b = ModuleDependencyDownloadIntentOperation.class.getSimpleName();

    public static Intent a(Context context, byte[] bArr) {
        Intent startIntent = IntentOperation.getStartIntent(context, ModuleDependencyDownloadIntentOperation.class, "com.google.android.gms.chimera.container.MODULE_DEPENDENCY_REQUEST");
        amtf.a((Object) startIntent);
        startIntent.putExtra("request_bytes", bArr);
        return startIntent;
    }

    public final void onHandleIntent(Intent intent) {
        Integer num;
        if (awxo.f()) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("request_bytes");
            if (byteArrayExtra != null) {
                try {
                    aedn aedn = (aedn) aucj.a((aucj) aedn.c, byteArrayExtra, aubs.b());
                    if (!aedn.a.isEmpty()) {
                        String str = aedn.a;
                        ModuleManager moduleManager = ModuleManager.get(this);
                        ArrayList arrayList = new ArrayList();
                        ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
                        aucx aucx = aedn.b;
                        int size = aucx.size();
                        boolean z = false;
                        int i = 0;
                        while (i < size) {
                            aedl aedl = (aedl) aucx.get(i);
                            int a2 = aeds.a(aedl.c);
                            if (a2 != 0 && a2 == 2) {
                                featureCheck.checkFeatureAtVersion(aedl.a, aedl.b);
                                aucd o = bob.f.o();
                                String str2 = aedl.a;
                                if (o.c) {
                                    o.c();
                                    o.c = z;
                                }
                                bob bob = (bob) o.b;
                                str2.getClass();
                                int i2 = bob.a | 1;
                                bob.a = i2;
                                bob.b = str2;
                                long j = aedl.b;
                                bob.a = i2 | 2;
                                bob.c = j;
                                arrayList.add((bob) o.i());
                            }
                            i++;
                            z = false;
                        }
                        int checkFeaturesAreAvailable = moduleManager.checkFeaturesAreAvailable(featureCheck);
                        if (checkFeaturesAreAvailable == 0) {
                            a(str, arrayList, 3);
                        } else if (checkFeaturesAreAvailable == 3 || checkFeaturesAreAvailable == 1) {
                            String str3 = b;
                            StringBuilder sb = new StringBuilder(56);
                            sb.append("The module dependencies cannot be satisfied: ");
                            sb.append(checkFeaturesAreAvailable);
                            Log.e(str3, sb.toString());
                            a(str, arrayList, 5);
                        } else {
                            ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
                            aucx aucx2 = aedn.b;
                            int size2 = aucx2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                aedl aedl2 = (aedl) aucx2.get(i3);
                                int a3 = aeds.a(aedl2.c);
                                if (a3 != 0 && a3 == 2) {
                                    featureRequest.requestFeatureAtVersion(aedl2.a, aedl2.b);
                                }
                            }
                            hfb hfb = new hfb();
                            featureRequest.setUrgent(hfb);
                            moduleManager.requestFeatures(featureRequest);
                            try {
                                num = (Integer) hfb.a.poll(awxo.a.a().x(), TimeUnit.MILLISECONDS);
                            } catch (InterruptedException e) {
                                num = null;
                            }
                            if (num != null) {
                                int intValue = num.intValue();
                                if (intValue == 0) {
                                    a(str, arrayList, 3);
                                } else if (intValue == 1) {
                                    a(str, arrayList, 4);
                                } else if (intValue == 2) {
                                    a(str, arrayList, 5);
                                }
                            } else {
                                a(str, arrayList, 4);
                            }
                        }
                    } else {
                        Log.w(b, "Received request without package name.");
                    }
                } catch (auda e2) {
                    String str4 = b;
                    String valueOf = String.valueOf(e2.toString());
                    Log.e(str4, valueOf.length() == 0 ? new String("Unable to parse request proto: ") : "Unable to parse request proto: ".concat(valueOf));
                }
            } else {
                Log.e(b, "Missing extra: request_bytes");
            }
        }
    }

    private final void a(String str, List list, int i) {
        cqn cqn;
        hem.a().a(this, 83, blj.b(list));
        hwz hwz = new hwz();
        if (!bindService(a, hwz, 1)) {
            Log.e(b, "Unable to bind to Phonesky");
            return;
        }
        try {
            IBinder a2 = hwz.a();
            if (a2 != null) {
                IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.finsky.zapp.protocol.IPlayModuleService");
                cqn = !(queryLocalInterface instanceof cqn) ? new cqn(a2) : (cqn) queryLocalInterface;
            } else {
                cqn = null;
            }
            if (cqn != null) {
                Bundle bundle = new Bundle();
                aucd o = aedq.d.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aedq aedq = (aedq) o.b;
                str.getClass();
                int i2 = 1 | aedq.a;
                aedq.a = i2;
                aedq.b = str;
                aedq.c = i - 1;
                aedq.a = i2 | 2;
                bundle.putByteArray("status_event_bytes", ((aedq) o.i()).k());
                Parcel aQ = cqn.aQ();
                bhx.a(aQ, (Parcelable) bundle);
                cqn.c(5, aQ);
                try {
                    unbindService(hwz);
                } catch (IllegalStateException e) {
                }
            } else {
                Log.e(b, "Unable to connect to Phonesky");
                try {
                    unbindService(hwz);
                } catch (IllegalStateException e2) {
                }
            }
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            try {
                unbindService(hwz);
            } catch (IllegalStateException e4) {
            }
        } catch (RemoteException e5) {
            String str2 = b;
            String valueOf = String.valueOf(e5.getMessage());
            Log.e(str2, valueOf.length() == 0 ? new String("Unable to deliver App Module Dependency event. ") : "Unable to deliver App Module Dependency event. ".concat(valueOf));
            try {
                unbindService(hwz);
            } catch (IllegalStateException e6) {
            }
        } catch (Throwable th) {
            try {
                unbindService(hwz);
            } catch (IllegalStateException e7) {
            }
            throw th;
        }
    }
}
