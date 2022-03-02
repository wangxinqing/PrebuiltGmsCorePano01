package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: mcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mcj extends nis {
    private final String a;
    private final Bundle b;
    private HttpURLConnection c;
    private final apwj d;

    public mcj(apwj apwj, String str, Bundle bundle) {
        super(131, "CreateShortDynamicLink");
        this.d = apwj;
        this.a = str;
        this.b = bundle;
    }

    private static final String a(InputStream inputStream) {
        if (inputStream != null) {
            return new String(jjt.b(inputStream), "UTF-8");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        Uri uri;
        JSONObject jSONObject;
        ArrayList arrayList;
        Uri uri2;
        Uri uri3;
        if (axfi.a.a().c()) {
            try {
                Bundle bundle = this.b;
                Uri uri4 = (Uri) bundle.getParcelable("dynamicLink");
                if (TextUtils.isEmpty(bundle.getString("domainUriPrefix"))) {
                    if (uri4 == null) {
                        throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
                    }
                }
                uri = (Uri) bundle.getParcelable("dynamicLink");
                if (uri == null) {
                    Uri.Builder builder = new Uri.Builder();
                    Uri parse = Uri.parse(bundle.getString("domainUriPrefix"));
                    builder.scheme(parse.getScheme());
                    builder.authority(parse.getAuthority());
                    builder.path(parse.getPath());
                    Bundle bundle2 = bundle.getBundle("parameters");
                    for (String str : bundle2.keySet()) {
                        Object obj = bundle2.get(str);
                        if (obj != null) {
                            builder.appendQueryParameter(str, obj.toString());
                        }
                    }
                    uri = builder.build();
                }
            } catch (IllegalArgumentException e) {
                uri = null;
            }
            if (uri != null) {
                try {
                    izj.b(16384);
                    URL url = new URL(String.format(axfi.a.a().d(), new Object[]{this.b.getString("apiKey")}));
                    if (this.c == null) {
                        this.c = (HttpURLConnection) url.openConnection();
                    }
                    this.c.setRequestMethod("POST");
                    this.c.setRequestProperty("Content-Type", "application/json");
                    this.c.setRequestProperty("Accept", "application/json");
                    this.c.setRequestProperty("X-Android-Package", this.a);
                    this.c.setRequestProperty("X-Android-Cert", jhg.h(context, this.a));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("longDynamicLink", uri.toString());
                    if (this.b.containsKey("suffix")) {
                        int i = this.b.getInt("suffix");
                        String str2 = i != 1 ? i != 2 ? null : "SHORT" : "UNGUESSABLE";
                        if (str2 != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("option", str2);
                            jSONObject2.put("suffix", jSONObject3);
                        }
                    }
                    this.c.setDoOutput(true);
                    DataOutputStream dataOutputStream = new DataOutputStream(this.c.getOutputStream());
                    dataOutputStream.writeBytes(jSONObject2.toString());
                    dataOutputStream.close();
                    if (this.c.getResponseCode() < 200 || this.c.getResponseCode() > 299) {
                        apwj apwj = this.d;
                        String responseMessage = this.c.getResponseMessage();
                        String a2 = a(this.c.getErrorStream());
                        int i2 = 7;
                        if (!TextUtils.isEmpty(a2) && (jSONObject = new JSONObject(a2).getJSONObject("error")) != null && jSONObject.has("code") && jSONObject.has("message")) {
                            i2 = jSONObject.getInt("code");
                            responseMessage = jSONObject.getString("message");
                        }
                        apwj.a(new Status(i2, responseMessage), (ShortDynamicLinkImpl) null);
                        return;
                    }
                    JSONObject jSONObject4 = new JSONObject(a(this.c.getInputStream()));
                    String string = jSONObject4.getString("shortLink");
                    String string2 = jSONObject4.getString("previewLink");
                    if (jSONObject4.has("warning")) {
                        JSONArray jSONArray = jSONObject4.getJSONArray("warning");
                        arrayList = new ArrayList(jSONArray.length());
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            arrayList.add(new ShortDynamicLinkImpl.WarningImpl(jSONArray.getJSONObject(i3).getString("warningMessage")));
                        }
                    } else {
                        arrayList = null;
                    }
                    if (string != null) {
                        uri2 = Uri.parse(string);
                    } else {
                        uri2 = null;
                    }
                    if (string2 != null) {
                        uri3 = Uri.parse(string2);
                    } else {
                        uri3 = null;
                    }
                    this.d.a(Status.a, new ShortDynamicLinkImpl(uri2, uri3, arrayList));
                } catch (IOException | JSONException e2) {
                    apev.a(e2);
                    this.d.a(Status.c, (ShortDynamicLinkImpl) null);
                }
            } else {
                this.d.a(Status.c, (ShortDynamicLinkImpl) null);
            }
        } else {
            this.d.a(Status.c, (ShortDynamicLinkImpl) null);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.d.a(status, (ShortDynamicLinkImpl) null);
    }
}
