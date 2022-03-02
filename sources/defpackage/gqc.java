package defpackage;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationData;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationExtension;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gqc {
    private static final iwd a = ehv.a("MinuteMaid", "MinuteMaidJsBridge");
    private static final iwd b = new iwd("MinuteMaidLog", new String[0]);
    private final gqb c;
    private final Context d;
    private final String e;
    private final TelephonyManager f;
    private final qub g;
    private final boolean h;
    private final boolean i;

    public gqc(gqb gqb, Context context, qub qub, TelephonyManager telephonyManager, String str, boolean z, boolean z2) {
        this.c = gqb;
        this.d = context;
        this.e = str;
        this.f = telephonyManager;
        this.g = qub;
        this.h = z;
        this.i = z2;
    }

    static String a(gok gok) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("accountName", gok.b).put("status", gok.a);
            return jSONObject.toString();
        } catch (JSONException e2) {
            a.e("Exception", e2, new Object[0]);
            return null;
        }
    }

    @JavascriptInterface
    public void addAccount(String str) {
        goz goz;
        a.b("addAccount(...)", new Object[0]);
        gqb gqb = this.c;
        try {
            JSONObject jSONObject = new JSONObject(str);
            goz = new goz(jSONObject.getString("authCode"), jSONObject.getString("obfuscatedGaiaId"));
        } catch (JSONException e2) {
            a.e("Caught exception", e2, new Object[0]);
            goz = null;
        }
        gqa gqa = (gqa) gqb;
        gqa.t.a(goz, gqa.y, gqa.z, gqa.A, gqa.B, true);
    }

    @JavascriptInterface
    public void attemptLogin(String str, String str2) {
        a.b("onAttemptLogin(...)", new Object[0]);
        gqb gqb = this.c;
        gqa gqa = (gqa) gqb;
        gqa.y = str;
        if (!((Boolean) ((gnb) gqb).b().a(gqa.j, false)).booleanValue()) {
            str2 = null;
        }
        gqa.z = str2;
    }

    @JavascriptInterface
    public final void cancelFido2SignRequest() {
        a.b("cancelFido2SecurityKeyAssertionRequest", new Object[0]);
        gqb gqb = this.c;
        gqa.d.b("onCancelSecurityKeyAssertion", new Object[0]);
        ((gqa) gqb).a(ErrorCode.TIMEOUT_ERR);
    }

    @JavascriptInterface
    public void cancelSecurityKeyAssertionRequest() {
        a.b("cancelSecurityKeyAssertionRequest", new Object[0]);
        gqb gqb = this.c;
        gqa.d.b("onCancelSecurityKeyAssertion", new Object[0]);
        ((gqa) gqb).a(com.google.android.gms.fido.u2f.api.common.ErrorCode.TIMEOUT);
    }

    @JavascriptInterface
    public void clearOldLoginAttempts() {
        a.b("clearOldLoginAttempts", new Object[0]);
        gqa gqa = (gqa) this.c;
        gqa.y = null;
        gqa.z = null;
    }

    @JavascriptInterface
    public void closeView() {
        a.b("closeView", new Object[0]);
        ((gqa) this.c).t.m();
    }

    @JavascriptInterface
    public void fetchIIDToken(String str) {
        a.b("fetchIIDToken", new Object[0]);
        new gpy(new gpt((gqa) this.c)).execute(new String[]{str});
    }

    @JavascriptInterface
    public void fetchVerifiedPhoneNumber(String str) {
        a.b("fetchVerifiedPhoneNumber", new Object[0]);
        gqb gqb = this.c;
        jpg jpg = new jpg(((Fragment) gqb).getActivity());
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
        } catch (JSONException e2) {
            gqa.d.e("Parse verification params json fails.", e2, new Object[0]);
        }
        acwa a2 = jpg.a(bundle);
        gqa gqa = (gqa) gqb;
        a2.a((acvv) new gpv(gqa));
        a2.a((acvs) new gpu(gqa));
    }

    @JavascriptInterface
    public String getAccounts() {
        JSONArray jSONArray = new JSONArray();
        for (Account account : this.g.a(this.e)) {
            jSONArray.put(account.name);
        }
        return jSONArray.toString();
    }

    @JavascriptInterface
    public String getAllowedDomains() {
        return "{}";
    }

    @JavascriptInterface
    public String getAndroidId() {
        long a2 = jhg.a(this.d);
        if (a2 != 0) {
            return Long.toHexString(a2);
        }
        return null;
    }

    @JavascriptInterface
    public int getAuthModuleVersionCode() {
        Collection<ModuleManager.ModuleInfo> collection;
        try {
            collection = ModuleManager.get(this.d).getAllModules();
        } catch (InvalidConfigException e2) {
            a.d("InvalidConfigException while trying to get all modules from module manager!", new Object[0]);
            collection = null;
        }
        if (collection == null) {
            a.d("Was not able to fetch list of modules or list is emptry!", new Object[0]);
            return 0;
        }
        for (ModuleManager.ModuleInfo moduleInfo : collection) {
            if ("com.google.android.gms.auth_account_base".equals(moduleInfo.moduleId)) {
                return moduleInfo.moduleVersion;
            }
        }
        a.d("Auth module is not found in the list of modules.", new Object[0]);
        return 0;
    }

    @JavascriptInterface
    public int getBuildVersionSdk() {
        return Build.VERSION.SDK_INT;
    }

    @JavascriptInterface
    public void getDeviceDataVersionInfo() {
        gqb gqb = this.c;
        gqa gqa = (gqa) gqb;
        gqa.D = new gpz(gqa, ((Fragment) gqb).getActivity().getApplicationContext());
        gqa.D.execute(new Void[0]);
    }

    @JavascriptInterface
    public void getDroidGuardResult(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList<String> arrayList = new ArrayList<>(str.length());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.get(i2).toString());
            }
            a.b("onRequestDroidGuardResult", new Object[0]);
            gqb gqb = this.c;
            StringBuilder sb = new StringBuilder();
            sb.append(Long.toHexString(jhg.a((Context) ((Fragment) gqb).getActivity())));
            sb.append(':');
            sb.append(Build.VERSION.SDK_INT);
            sb.append(':');
            sb.append(201216073);
            for (String append : arrayList) {
                sb.append(':');
                sb.append(append);
            }
            gop gop = ((gqa) gqb).x;
            Map singletonMap = Collections.singletonMap("dg_minutemaid", Base64.encodeToString(jhg.a(sb.toString(), "SHA-1"), 0));
            if (gop.e != null) {
                goo goo = new goo(gop, singletonMap);
                goo.execute(new Void[0]);
                gop.d.add(goo);
                return;
            }
            throw new IllegalStateException();
        } catch (JSONException e2) {
            a.e("Could not parse JSON array.", new Object[0]);
        }
    }

    @JavascriptInterface
    public String getPhoneNumber() {
        if (this.h) {
            return this.f.getLine1Number();
        }
        return null;
    }

    @JavascriptInterface
    public int getPlayServicesVersionCode() {
        return 201216073;
    }

    @JavascriptInterface
    public String getSimSerial() {
        if (this.h) {
            return this.f.getSimSerialNumber();
        }
        return null;
    }

    @JavascriptInterface
    public int getSimState() {
        return this.f.getSimState();
    }

    @JavascriptInterface
    public void goBack() {
        a.b("onBack", new Object[0]);
        gqa gqa = (gqa) this.c;
        gqa.s.post(new gpo(gqa));
    }

    @JavascriptInterface
    public boolean hasPhoneNumber() {
        return !TextUtils.isEmpty(getPhoneNumber());
    }

    @JavascriptInterface
    public boolean hasTelephony() {
        return this.f.getPhoneType() != 0;
    }

    @JavascriptInterface
    public void hideKeyboard() {
        a.b("onHideKeyboard", new Object[0]);
        gqa gqa = (gqa) this.c;
        gqa.u.hideSoftInputFromWindow(gqa.v.getWindowToken(), 0);
    }

    @JavascriptInterface
    public boolean isUserOwner() {
        return this.i;
    }

    @JavascriptInterface
    public void launchEmergencyDialer() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(ComponentName.unflattenFromString("com.android.phone/.EmergencyDialer"));
        intent.addFlags(268435456);
        this.d.startActivity(intent);
    }

    @JavascriptInterface
    public void log(String str) {
        b.b(str, new Object[0]);
    }

    @JavascriptInterface
    public void notifyOnTermsOfServiceAccepted() {
        a.b("onTermsOfServiceAccepted", new Object[0]);
        ((gqa) this.c).B = true;
    }

    @JavascriptInterface
    public final void sendFido2SkUiEvent(String str) {
        a.b("sendFido2SkUiEvent(...)", new Object[0]);
        gqb gqb = this.c;
        try {
            StateUpdate a2 = StateUpdate.a(new JSONObject(str));
            if (a2.equals(StateUpdate.a) || a2.equals(StateUpdate.d)) {
                ((gqa) gqb).d();
            } else {
                ((gqa) gqb).E.a(a2);
            }
        } catch (JSONException e2) {
            gqa.d.e("Invalid user action json response.", e2, new Object[0]);
            ((gqa) gqb).a(ErrorCode.TIMEOUT_ERR);
        } catch (mzf e3) {
            gqa.d.e("Unimplemented user action type.", e3, new Object[0]);
        }
    }

    @JavascriptInterface
    public void sendSkUiEvent(String str) {
        a.b("sendSkUiEvent(...)", new Object[0]);
        gqb gqb = this.c;
        try {
            com.google.android.gms.fido.u2f.api.StateUpdate a2 = com.google.android.gms.fido.u2f.api.StateUpdate.a(new JSONObject(str));
            nbg nbg = ((gqa) gqb).H;
            if (nbg == null) {
                gqa.d.e("onSecurityKeyUserAction should not be called when the api client is null.\nUserAction is %s", str);
                return;
            }
            nbg.a(a2).a((acvs) new gpe(str));
        } catch (JSONException e2) {
            gqa.d.e("Invalid user action json response.", e2, new Object[0]);
            ((gqa) gqb).a(com.google.android.gms.fido.u2f.api.common.ErrorCode.OTHER_ERROR);
        } catch (nbj e3) {
            gqa.d.e("Unimplemented user action type.", e3, new Object[0]);
        }
    }

    @JavascriptInterface
    public void setAccountIdentifier(String str) {
        a.b("onAccountIdentifierSet(...)", new Object[0]);
        gqa gqa = (gqa) this.c;
        gqa.y = str;
        gqa.z = null;
    }

    @JavascriptInterface
    public void setAllActionsEnabled(boolean z) {
        gqa gqa = (gqa) this.c;
        gqa.s.post(new gpk(gqa, z));
    }

    @JavascriptInterface
    public void setBackButtonEnabled(boolean z) {
        a.b("onRequestBackButton", new Object[0]);
        ((gqa) this.c).t.b(z);
    }

    @JavascriptInterface
    public void setNewAccountCreated() {
        a.b("onNewAccountCreated", new Object[0]);
        ((gqa) this.c).A = true;
    }

    @JavascriptInterface
    public void setPrimaryActionEnabled(boolean z) {
        gqa gqa = (gqa) this.c;
        gqa.s.post(new gpi(gqa, z));
    }

    @JavascriptInterface
    public void setPrimaryActionLabel(String str, int i2) {
        gqa gqa = (gqa) this.c;
        gqa.s.post(new gpg(gqa, str, i2));
    }

    @JavascriptInterface
    public void setSecondaryActionEnabled(boolean z) {
        gqa gqa = (gqa) this.c;
        gqa.s.post(new gpj(gqa, z));
    }

    @JavascriptInterface
    public void setSecondaryActionLabel(String str, int i2) {
        gqa gqa = (gqa) this.c;
        gqa.s.post(new gph(gqa, str, i2));
    }

    @JavascriptInterface
    public void showKeyboard() {
        a.b("onShowKeyboard", new Object[0]);
        gqa gqa = (gqa) this.c;
        gqa.u.showSoftInput(gqa.v, 1);
    }

    @JavascriptInterface
    public void showView() {
        a.b("onShowView", new Object[0]);
        ((gqa) this.c).t.l();
    }

    @JavascriptInterface
    public void skipLogin() {
        a.b("onSkip", new Object[0]);
        ((gqa) this.c).t.o();
    }

    @JavascriptInterface
    public void startAfw() {
        a.b("onStartAndroidForWork", new Object[0]);
        ((gqa) this.c).t.p();
    }

    @JavascriptInterface
    public final void startFido2SignRequest(String str) {
        a.b("startFido2SecurityKeyAssertionRequest", new Object[0]);
        gqb gqb = this.c;
        iwd iwd = gqa.d;
        String valueOf = String.valueOf(str);
        iwd.b(valueOf.length() == 0 ? new String("Got Security Key request: ") : "Got Security Key request: ".concat(valueOf), new Object[0]);
        gqa gqa = (gqa) gqb;
        gqa.E = mys.b(((Fragment) gqb).getActivity());
        try {
            JSONObject jSONObject = new JSONObject(str);
            mzv mzv = new mzv();
            mzv.a = (byte[]) iva.a((Object) Base64.decode(jSONObject.getString("challenge"), 11));
            if (jSONObject.has("timeoutSeconds")) {
                mzv.b = Double.valueOf(jSONObject.getDouble("timeoutSeconds"));
            }
            String string = jSONObject.getString("rpId");
            iva.a((Object) string);
            mzv.c = string;
            if (jSONObject.has("allowList")) {
                JSONArray jSONArray = jSONObject.getJSONArray("allowList");
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(PublicKeyCredentialDescriptor.a(jSONArray.getJSONObject(i2)));
                }
                mzv.d = arrayList;
            }
            if (jSONObject.has("requestId")) {
                mzv.e = Integer.valueOf(jSONObject.getInt("requestId"));
            }
            if (jSONObject.has("tokenBinding")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("tokenBinding");
                mzv.f = new TokenBinding(jSONObject2.getString("status"), jSONObject2.has("id") ? jSONObject2.getString("id") : null);
            }
            if (jSONObject.has("userVerification")) {
                mzv.g = UserVerificationRequirement.a(jSONObject.getString("userVerification"));
            }
            if (jSONObject.has("authenticationExtensions")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("authenticationExtensions");
                mzh mzh = new mzh();
                if (jSONObject3.has("fidoAppIdExtension")) {
                    mzh.a = new FidoAppIdExtension(jSONObject3.getJSONObject("fidoAppIdExtension").getString("appid"));
                }
                if (jSONObject3.has("cableAuthenticationExtension")) {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("cableAuthenticationExtension");
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                        arrayList2.add(new CableAuthenticationData(jSONObject4.getLong("version"), Base64.decode(jSONObject4.getString("clientEid"), 11), Base64.decode(jSONObject4.getString("authenticatorEid"), 11), Base64.decode(jSONObject4.getString("sessionPreKey"), 11)));
                    }
                    mzh.c = new CableAuthenticationExtension(arrayList2);
                }
                if (jSONObject3.has("userVerificationMethodExtension")) {
                    mzh.b = new UserVerificationMethodExtension(jSONObject3.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
                }
                mzv.h = new AuthenticationExtensions(mzh.a, mzh.c, mzh.b);
            }
            byte[] bArr = mzv.a;
            Double d2 = mzv.b;
            String str2 = mzv.c;
            List list = mzv.d;
            Integer num = mzv.e;
            TokenBinding tokenBinding = mzv.f;
            UserVerificationRequirement userVerificationRequirement = mzv.g;
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = new PublicKeyCredentialRequestOptions(bArr, d2, str2, list, num, tokenBinding, userVerificationRequirement != null ? userVerificationRequirement.d : null, mzv.h);
            gps gps = new gps(gqa, new goq(gqa));
            mzc mzc = gqa.E;
            iha b2 = ihb.b();
            b2.a = new myy(mzc, gps, publicKeyCredentialRequestOptions);
            b2.b = new Feature[]{myr.c};
            mzc.a(b2.a()).a((acvp) new gpf(gqa));
        } catch (JSONException e2) {
            gqa.d.e("Couldn't parse JSON request to SignRequestMessage!", e2, new Object[0]);
            gqa.a(ErrorCode.ENCODING_ERR);
        } catch (nae e3) {
            gqa.d.e("UserVerfier is unsupported!", e3, new Object[0]);
            gqa.a(ErrorCode.ENCODING_ERR);
        }
    }

    @JavascriptInterface
    public void startSecurityKeyAssertionRequest(String str) {
        Integer num;
        Double d2;
        String str2;
        byte[] bArr;
        List list;
        Object obj;
        a.b("startSecurityKeyAssertionRequest", new Object[0]);
        gqb gqb = this.c;
        iwd iwd = gqa.d;
        String valueOf = String.valueOf(str);
        iwd.b(valueOf.length() == 0 ? new String("Got Security Key request: ") : "Got Security Key request: ".concat(valueOf), new Object[0]);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Uri uri = null;
            if (jSONObject.has("requestId")) {
                num = Integer.valueOf(jSONObject.getInt("requestId"));
            } else {
                num = null;
            }
            if (jSONObject.has("timeoutSeconds")) {
                d2 = Double.valueOf(jSONObject.getDouble("timeoutSeconds"));
            } else {
                d2 = null;
            }
            if (jSONObject.has("appId")) {
                str2 = jSONObject.getString("appId");
            } else {
                str2 = null;
            }
            if (jSONObject.has("challenge")) {
                bArr = Base64.decode(jSONObject.getString("challenge"), 11);
            } else {
                bArr = null;
            }
            if (jSONObject.has("registeredKeys")) {
                list = nck.a(jSONObject.getJSONArray("registeredKeys"));
            } else if (jSONObject.has("signRequests")) {
                list = nck.a(jSONObject.getJSONArray("signRequests"));
            } else {
                throw new JSONException("Server provided no list of registered keys");
            }
            gqa gqa = (gqa) gqb;
            gqa.C = new ncl(new nck(num, d2, str2, bArr, list));
            ncl ncl = gqa.C;
            Uri parse = Uri.parse(gqa.w);
            iva.a((Object) parse);
            ncg ncg = ncg.REGISTER;
            int ordinal = ncg.SIGN.ordinal();
            if (ordinal == 0) {
                ncd ncd = (ncd) ncl.a;
                throw null;
            } else if (ordinal == 1) {
                nce nce = ncl.a;
                nca nca = new nca();
                nck nck = (nck) nce;
                String str3 = nck.c;
                if (str3 != null) {
                    uri = Uri.parse(str3);
                }
                nca.c = uri;
                nca.d = nck.d;
                nca.e = nck.e;
                nca.b = nck.b;
                nca.a = nck.a;
                SignRequestParams signRequestParams = new SignRequestParams(nca.a, nca.b, nca.c, nca.d, nca.e, (ChannelIdValue) null, (String) null);
                int ordinal2 = ncg.SIGN.ordinal();
                if (ordinal2 == 0) {
                    nbl nbl = new nbl();
                    nbl.a = (RegisterRequestParams) signRequestParams;
                    nbl.b = parse;
                    obj = new BrowserRegisterRequestParams(nbl.a, nbl.b);
                } else if (ordinal2 == 1) {
                    nbn nbn = new nbn();
                    nbn.a = signRequestParams;
                    nbn.b = parse;
                    obj = new BrowserSignRequestParams(nbn.a, nbn.b);
                } else {
                    String valueOf2 = String.valueOf(ncg.SIGN);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 25);
                    sb.append("Unsupported request type ");
                    sb.append(valueOf2);
                    throw new RuntimeException(sb.toString());
                }
                gqa.F = (BrowserSignRequestParams) obj;
                gqa.J = new gpq(gqa, new gqf(gqa));
                gqa.H = mys.a(((Fragment) gqb).getActivity());
                gqa.H.a((ihb) new nbd(gqa.F, new nbh(gqa.J))).a(gpd.a);
            } else {
                String valueOf3 = String.valueOf(ncg.SIGN);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 25);
                sb2.append("Unsupported request type ");
                sb2.append(valueOf3);
                throw new RuntimeException(sb2.toString());
            }
        } catch (IllegalArgumentException e2) {
            throw new JSONException(e2.getMessage());
        } catch (JSONException e3) {
            gqa.d.e("Couldn't parse JSON request to SignRequestMessage!", e3, new Object[0]);
            ((gqa) gqb).a(com.google.android.gms.fido.u2f.api.common.ErrorCode.BAD_REQUEST);
        }
    }
}
