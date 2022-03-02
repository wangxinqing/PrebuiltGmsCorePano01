package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: aauf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aauf extends nis {
    final int a;
    private final zzw b;
    private final String c;
    private final int d;
    private final byte[] e;
    private final String f;
    private final Bundle g;

    static {
        aauf.class.getSimpleName();
    }

    public aauf(zzw zzw, String str, String str2, int i, byte[] bArr, int i2, Bundle bundle) {
        super(45, "pha");
        this.b = zzw;
        this.f = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
        this.a = i2;
        this.g = bundle;
    }

    private final void a() {
        b(Status.c);
    }

    private final void b(Status status) {
        zzw zzw = this.b;
        if (zzw != null) {
            zzw.b(status, false);
        }
    }

    private static final void a(Context context, List list) {
        if (list != null) {
            aaui a2 = aaui.a(context);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Bundle bundle = (Bundle) it.next();
                byte[] byteArray = bundle.getByteArray("digest");
                if (byteArray != null) {
                    aauh aauh = new aauh();
                    aauh.a = bundle.getString("package_name");
                    aauh.b = bundle.getString("threat_type");
                    aauh.c = bundle.getString("description_string");
                    a2.a(byteArray, aauh);
                }
            }
        }
    }

    public final void a(Context context) {
        Intent intent;
        List<aaae> list;
        JSONObject jSONObject;
        if (aann.b(context, this.c)) {
            try {
                boolean z = false;
                if (this.a == 1) {
                    byte[] bArr = this.e;
                    String str = this.f;
                    int i = this.d;
                    if (TextUtils.isEmpty(str)) {
                        b(new Status(12001));
                    } else if (bArr != null) {
                        if (i == 1) {
                            String a2 = aaae.a(bArr);
                            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 30);
                            sb.append("safe.safebrowsing.google.com/");
                            sb.append(a2);
                            sb.append("/");
                            list = new aaak(sb.toString()).a();
                            if (list == null || list.isEmpty()) {
                                a();
                                return;
                            }
                        } else {
                            list = Collections.singletonList(new aaae(bArr));
                        }
                        aaum.b(context);
                        try {
                            if (aaum.d.await(60000, TimeUnit.MILLISECONDS)) {
                                if (i == 12) {
                                    aaur aaur = aaum.c;
                                    List<Integer> singletonList = Collections.singletonList(12);
                                    HashSet<Integer> hashSet = new HashSet<>();
                                    for (Integer intValue : singletonList) {
                                        int intValue2 = intValue.intValue();
                                        anax anax = aaur.b;
                                        Integer valueOf = Integer.valueOf(intValue2);
                                        if (anax.contains(valueOf) && aaur.n.a().contains(valueOf)) {
                                            hashSet.add(valueOf);
                                        }
                                    }
                                    if (!hashSet.isEmpty()) {
                                        jSONObject = new JSONObject();
                                        if (aaur.b()) {
                                            ArrayList arrayList = new ArrayList();
                                            for (Integer intValue3 : hashSet) {
                                                int intValue4 = intValue3.intValue();
                                                aaun aaun = (aaun) aaur.k.get(intValue4);
                                                if (aaun != null) {
                                                    for (aaae a3 : list) {
                                                        if (aaun.a(a3)) {
                                                            arrayList.add(Integer.valueOf(intValue4));
                                                        }
                                                    }
                                                }
                                            }
                                            jSONObject = aawf.a((List) arrayList);
                                        }
                                    } else {
                                        jSONObject = null;
                                    }
                                } else {
                                    jSONObject = aaum.c.a(Collections.singletonList(Integer.valueOf(i)), list, str, this.c);
                                }
                                if (jSONObject == null) {
                                    b(new Status(12000));
                                    return;
                                }
                                if (jSONObject.length() != 0) {
                                    z = true;
                                }
                                this.b.b(Status.a, z);
                                return;
                            }
                            a();
                        } catch (InterruptedException e2) {
                            a();
                        }
                    } else {
                        a();
                    }
                } else {
                    int i2 = this.d;
                    if (i2 == 1) {
                        if (azfv.t()) {
                            Bundle bundle = this.g;
                            if (bundle != null) {
                                a(context, Collections.singletonList(bundle));
                            }
                        }
                        intent = new Intent("com.google.android.gms.safetynet.action.HARMFUL_APP_INSTALLED");
                    } else if (i2 == 3) {
                        intent = new Intent("com.google.android.gms.safetynet.action.HARMFUL_APP_BLOCKED");
                    } else if (i2 == 4) {
                        if (azfv.t()) {
                            Bundle bundle2 = this.g;
                            if (bundle2 != null) {
                                a(context, bundle2.getParcelableArrayList("harmful_app_bundles"));
                            }
                        }
                        intent = new Intent("com.google.android.gms.safetynet.action.HARMFUL_APPS_FOUND");
                    } else {
                        return;
                    }
                    if (jkr.e()) {
                        PackageManager packageManager = context.getPackageManager();
                        ArrayList<Intent> arrayList2 = new ArrayList<>();
                        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                        if (queryBroadcastReceivers != null) {
                            for (ResolveInfo next : queryBroadcastReceivers) {
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                                arrayList2.add(intent2);
                            }
                        }
                        for (Intent sendBroadcast : arrayList2) {
                            context.sendBroadcast(sendBroadcast);
                        }
                        return;
                    }
                    context.sendBroadcast(intent);
                }
            } catch (RemoteException e3) {
                throw e3;
            } catch (Exception e4) {
                a();
            }
        } else {
            a();
        }
    }

    public final void a(Status status) {
        a();
    }
}
