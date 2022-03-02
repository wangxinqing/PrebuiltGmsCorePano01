package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthType;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.ServiceType;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: abpg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abpg {
    public static final /* synthetic */ int b = 0;
    private static final iwd c = acqa.a("D2D", "EsimController");
    public final SharedPreferences a;
    private final Context d;

    public abpg(Context context) {
        this.d = context;
        this.a = context.getSharedPreferences("SmartDevice.EsimController", 0);
    }

    public final acwa a() {
        String string = this.a.getString("esimActivationPayload", (String) null);
        if (string == null) {
            return acws.a((Object) new ArrayList());
        }
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                EsimActivationPayload esimActivationPayload = new EsimActivationPayload();
                esimActivationPayload.e(jSONArray.getJSONObject(i).toString().getBytes("UTF-8"));
                arrayList.add(esimActivationPayload);
            }
            return acws.a((Object) arrayList);
        } catch (acpi | UnsupportedEncodingException | JSONException e) {
            return acws.a(e);
        }
    }

    public final acwa a(EsimActivationInfo esimActivationInfo) {
        acwa acwa;
        boolean z;
        if (jkr.h()) {
            List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) this.d.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
            ArrayList arrayList = new ArrayList(activeSubscriptionInfoList.size());
            int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
            for (SubscriptionInfo next : activeSubscriptionInfoList) {
                if (next.isEmbedded()) {
                    arrayList.add(next);
                    if (next.getSubscriptionId() == defaultDataSubscriptionId) {
                        defaultDataSubscriptionId = -1;
                    }
                }
            }
            if (defaultDataSubscriptionId != -1) {
                for (SubscriptionInfo next2 : activeSubscriptionInfoList) {
                    if (next2.getSubscriptionId() == defaultDataSubscriptionId) {
                        arrayList.add(next2);
                    }
                }
            }
            for (SubscriptionInfo next3 : activeSubscriptionInfoList) {
                if (!next3.isEmbedded() && next3.getSubscriptionId() != defaultDataSubscriptionId) {
                    arrayList.add(next3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            tas tas = new tas(this.d);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                SubscriptionInfo subscriptionInfo = (SubscriptionInfo) arrayList.get(i);
                try {
                    long parseLong = Long.parseLong(esimActivationInfo.e);
                    abpf abpf = new abpf();
                    TelephonyManager createForSubscriptionId = ((TelephonyManager) this.d.getSystemService(TelephonyManager.class)).createForSubscriptionId(subscriptionInfo.getSubscriptionId());
                    tba tba = new tba();
                    tba.a.a = "smartDevice";
                    tba.a.c = Long.valueOf(parseLong);
                    ServiceType serviceType = new tbk().a;
                    serviceType.a = 6;
                    tba.a.b = serviceType;
                    AuthType authType = new tax().a;
                    authType.a = 2;
                    tba.a.d = authType;
                    String subscriberId = createForSubscriptionId.getSubscriberId();
                    CheckAuthStatusRequest checkAuthStatusRequest = tba.a;
                    checkAuthStatusRequest.e = subscriberId;
                    iva.b(true, "Need a non-null request.");
                    if (checkAuthStatusRequest.a != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iva.b(z, "Need a non-null request_id.");
                    iha b2 = ihb.b();
                    b2.a = new tal(checkAuthStatusRequest);
                    b2.b = new Feature[]{taj.a};
                    acwa = tas.b(b2.a()).a((acvz) new abpe(abpf, tas)).a((acvz) new abpd(abpf, esimActivationInfo, createForSubscriptionId, tas)).a((acvz) new abpc(abpf, esimActivationInfo, subscriptionInfo));
                } catch (NumberFormatException e) {
                    acwa = acws.a((Exception) e);
                }
                arrayList2.add(acwa);
            }
            return acws.c(arrayList2).a(abpb.a);
        }
        c.e("eSIM seamless transfer only supports Android Q or later", new Object[0]);
        return acws.a((Object) new ArrayList());
    }

    public final void a(ArrayList arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(((EsimActivationPayload) it.next()).toString()));
            }
            this.a.edit().putString("esimActivationPayload", jSONArray.toString()).apply();
        } catch (JSONException e) {
            iwd iwd = c;
            String valueOf = String.valueOf(arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Invalid esimActivationPayloads: ");
            sb.append(valueOf);
            iwd.e(sb.toString(), new Object[0]);
        }
    }
}
