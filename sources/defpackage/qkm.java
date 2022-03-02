package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.chimera.FragmentTransaction;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: qkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qkm {
    private static final qfn a = new qfn("IntentSignatureUtil");
    private static final ob b;
    private final SharedPreferences c;
    private final SecretKey d;

    static {
        ob obVar = new ob(2);
        b = obVar;
        Collections.addAll(obVar, new String[]{"com.google.android.gms.instantapps.API_CALLER_PKG", "com.google.android.gms.instantapps.API_CALL_TIME_MS"});
    }

    public qkm(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences;
        this.d = a(sharedPreferences);
    }

    private static SecretKey a(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("intentMacSecret", "");
        if (TextUtils.isEmpty(string)) {
            try {
                KeyGenerator instance = KeyGenerator.getInstance("HmacSHA256");
                instance.init(160);
                SecretKey generateKey = instance.generateKey();
                sharedPreferences.edit().putString("intentMacSecret", Base64.encodeToString(generateKey.getEncoded(), 0)).apply();
                return generateKey;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("All Java platforms are required to have HmacSHA256", e);
            }
        } else {
            try {
                return new SecretKeySpec(Base64.decode(string, 0), "HmacSHA256");
            } catch (IllegalArgumentException e2) {
                b(sharedPreferences);
                throw new RuntimeException("secret key in shared prefs is bad", e2);
            }
        }
    }

    public static void b(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            String scheme = data.getScheme();
            if (scheme != null) {
                String lowerCase = scheme.toLowerCase();
                if (lowerCase.equals("http") || lowerCase.equals("https")) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        for (String str : extras.keySet()) {
                            if (b.contains(str)) {
                                intent.removeExtra(str);
                            }
                        }
                        return;
                    }
                    return;
                }
                throw new qkl("URI scheme is not supported");
            }
            throw new qkl("URI scheme is null");
        }
        throw new qkl("URI is null");
    }

    public final byte[] c(Intent intent) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(this.d);
            ByteBuffer allocate = ByteBuffer.allocate(FragmentTransaction.TRANSIT_ENTER_MASK);
            try {
                a(intent.getData(), allocate);
                allocate.flip();
                instance.update(allocate);
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    ArrayList arrayList = new ArrayList(extras.keySet());
                    Collections.sort(arrayList);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) arrayList.get(i);
                        if (b.contains(str)) {
                            allocate.clear();
                            allocate.put((byte) 0);
                            byte[] bytes = str.getBytes();
                            allocate.putInt(bytes.length);
                            allocate.put(bytes);
                            allocate.flip();
                            instance.update(allocate);
                            allocate.clear();
                            try {
                                Object obj = extras.get(str);
                                if (obj == null) {
                                    allocate.put((byte) 1);
                                } else if (obj instanceof String) {
                                    allocate.put((byte) 2);
                                    byte[] bytes2 = ((String) obj).getBytes();
                                    allocate.putInt(bytes2.length);
                                    allocate.put(bytes2);
                                } else if (obj instanceof Boolean) {
                                    allocate.put((byte) 3);
                                    allocate.put(((Boolean) obj).booleanValue() ^ true ? (byte) 1 : 0);
                                } else if (obj instanceof Integer) {
                                    allocate.put((byte) 4);
                                    allocate.putInt(((Integer) obj).intValue());
                                } else if (obj instanceof Long) {
                                    allocate.put((byte) 5);
                                    allocate.putLong(((Long) obj).longValue());
                                } else if (!(obj instanceof Parcelable)) {
                                    String valueOf = String.valueOf(str);
                                    String str2 = valueOf.length() == 0 ? new String("Unsupported extra value type for key ") : "Unsupported extra value type for key ".concat(valueOf);
                                    a.d("%s", str2);
                                    throw new qkl(str2);
                                } else if (!(obj instanceof PendingIntent)) {
                                    allocate.put((byte) 7);
                                    a((Parcelable) obj, allocate);
                                } else {
                                    allocate.put((byte) 6);
                                }
                                allocate.flip();
                                instance.update(allocate);
                            } catch (BufferOverflowException e) {
                                String valueOf2 = String.valueOf(str);
                                String str3 = valueOf2.length() == 0 ? new String("Extra value too big for key ") : "Extra value too big for key ".concat(valueOf2);
                                a.d("%s", str3);
                                throw new qkl(str3, e);
                            }
                        }
                    }
                }
                return instance.doFinal();
            } catch (BufferOverflowException e2) {
                a.c("URI too long", new Object[0]);
                throw new qkl("URI too long", e2);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException("All Java platforms are required to have HmacSHA256", e3);
        } catch (InvalidKeyException e4) {
            b(this.c);
            throw new RuntimeException(e4);
        }
    }

    private static void b(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().remove("intentMacSecret").apply();
        a(sharedPreferences);
    }

    private static void a(Uri uri, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 8);
        if (uri == null) {
            byteBuffer.put((byte) 1);
            return;
        }
        try {
            a((Parcelable) uri, byteBuffer);
        } catch (BufferOverflowException e) {
            a.c("%s", "URL loo long");
            throw new qkl("URL loo long", e);
        }
    }

    private static void a(Parcelable parcelable, ByteBuffer byteBuffer) {
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        byteBuffer.putInt(marshall.length);
        byteBuffer.put(marshall);
    }

    public final void a(Intent intent) {
        intent.putExtra("com.google.android.gms.instantapps.INTENT_HMAC", c(intent));
    }
}
