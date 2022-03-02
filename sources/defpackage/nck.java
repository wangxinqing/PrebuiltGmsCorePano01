package defpackage;

import android.util.Base64;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: nck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nck implements nce {
    public final Integer a;
    public final Double b;
    public final String c;
    public final byte[] d;
    public final List e;

    public nck(Integer num, Double d2, String str, byte[] bArr, List list) {
        boolean z;
        boolean z2;
        this.a = num;
        this.b = d2;
        this.c = str;
        this.d = bArr;
        iva.b(!list.isEmpty(), "Server provided empty list of registered keys");
        this.e = list;
        HashSet hashSet = new HashSet();
        String str2 = this.c;
        if (str2 != null) {
            hashSet.add(str2);
        }
        List list2 = this.e;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            RegisteredKey registeredKey = (RegisteredKey) list2.get(i);
            if (registeredKey.b == null && this.c == null) {
                z = false;
            } else {
                z = true;
            }
            iva.b(z, "Server provided request with null appId and no request appId");
            if (registeredKey.c == null && this.d == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            iva.b(z2, "Server provided request with null challenge and no default challenge");
            String str3 = registeredKey.b;
            if (str3 != null) {
                hashSet.add(str3);
            }
        }
    }

    public static List a(JSONArray jSONArray) {
        String str;
        String str2;
        List list;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jSONArray.length()) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String str3 = null;
            if (jSONObject.has("challenge")) {
                str = jSONObject.getString("challenge");
            } else {
                str = null;
            }
            if (jSONObject.has("version")) {
                str2 = jSONObject.getString("version");
            } else {
                str2 = null;
            }
            try {
                ProtocolVersion a2 = ProtocolVersion.a(str2);
                try {
                    byte[] decode = Base64.decode(jSONObject.getString("keyHandle"), 8);
                    if (jSONObject.has("transports")) {
                        list = Transport.a(jSONObject.getJSONArray("transports"));
                    } else {
                        list = null;
                    }
                    KeyHandle keyHandle = new KeyHandle(decode, a2, list);
                    if (jSONObject.has("appId")) {
                        str3 = jSONObject.getString("appId");
                    }
                    arrayList.add(new RegisteredKey(keyHandle, str, str3));
                    i++;
                } catch (IllegalArgumentException e2) {
                    throw new JSONException(e2.toString());
                }
            } catch (nbw e3) {
                throw new JSONException(e3.toString());
            }
        }
        return arrayList;
    }

    public final JSONObject a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nck) {
            nck nck = (nck) obj;
            return ius.a(this.a, nck.a) && ius.a(this.b, nck.b) && ius.a(this.c, nck.c) && Arrays.equals(this.d, nck.d) && ius.a(this.e, nck.e);
        }
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.d) * 31) + Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e});
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", ncg.SIGN.c);
            Integer num = this.a;
            if (num != null) {
                jSONObject.put("requestId", num);
            }
            Double d2 = this.b;
            if (d2 != null) {
                jSONObject.put("timeoutSeconds", d2);
            }
            String str = this.c;
            if (str != null) {
                jSONObject.put("appId", str);
            }
            byte[] bArr = this.d;
            if (bArr != null) {
                jSONObject.put("challenge", Base64.encodeToString(bArr, 11));
            }
            JSONArray jSONArray = new JSONArray();
            for (RegisteredKey registeredKey : this.e) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    String str2 = registeredKey.c;
                    if (str2 != null) {
                        jSONObject2.put("challenge", str2);
                    }
                    KeyHandle keyHandle = registeredKey.a;
                    JSONObject jSONObject3 = new JSONObject();
                    byte[] bArr2 = keyHandle.b;
                    if (bArr2 != null) {
                        jSONObject3.put("keyHandle", Base64.encodeToString(bArr2, 11));
                    }
                    ProtocolVersion protocolVersion = keyHandle.c;
                    if (protocolVersion != null) {
                        jSONObject3.put("version", protocolVersion.d);
                    }
                    if (keyHandle.d != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (Transport transport : keyHandle.d) {
                            jSONArray2.put(transport.g);
                        }
                        jSONObject3.put("transports", jSONArray2);
                    }
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject3.get(next));
                    }
                    String str3 = registeredKey.b;
                    if (str3 != null) {
                        jSONObject2.put("appId", str3);
                    }
                    jSONArray.put(jSONObject2);
                } catch (JSONException e2) {
                    throw new RuntimeException(e2);
                } catch (JSONException e3) {
                    throw new RuntimeException(e3);
                }
            }
            jSONObject.put("registeredKeys", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }
}
