package com.google.android.gms.ads.internal.util.client;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.doubleclick.b;
import com.google.android.gms.ads.internal.flag.g;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class a {
    static {
        new qvr(Looper.getMainLooper());
        djz.class.getName();
        dkc.class.getName();
        com.google.android.gms.ads.doubleclick.a.class.getName();
        b.class.getName();
        com.google.android.gms.ads.search.a.class.getName();
        djy.class.getName();
    }

    public static String a() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return bigInteger;
    }

    public static Throwable a(Throwable th) {
        if (!((Boolean) g.d.a()).booleanValue()) {
            LinkedList linkedList = new LinkedList();
            while (th != null) {
                linkedList.push(th);
                th = th.getCause();
            }
            th = null;
            while (!linkedList.isEmpty()) {
                Throwable th2 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th2.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th2.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (a(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        } else {
                            arrayList.add(stackTraceElement);
                        }
                    }
                }
                if (z) {
                    if (th != null) {
                        th = new Throwable(th2.getMessage(), th);
                    } else {
                        th = new Throwable(th2.getMessage());
                    }
                    th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        return th;
    }

    public static boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith((String) g.b.a());
        }
        return false;
    }
}
