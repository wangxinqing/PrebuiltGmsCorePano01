package defpackage;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* renamed from: iyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iyq extends Request {
    private static final Pattern e = Pattern.compile("Content-ID: <response-item:(\\d+)>");
    private static final Pattern f = Pattern.compile("HTTP/1\\.1 (\\d+) (.*)");
    private static final Pattern g = Pattern.compile("(.+?): (.+)");
    public final CountDownLatch d = new CountDownLatch(1);
    private final ArrayList h;

    public iyq(String str, ArrayList arrayList) {
        super(1, String.valueOf(str).concat("/batch"), new iyp(arrayList));
        this.h = arrayList;
    }

    public final void deliverError(VolleyError volleyError) {
        for (int i = 0; i < this.h.size(); i++) {
            ((iyw) this.h.get(i)).deliverError(volleyError);
        }
        this.d.countDown();
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        NetworkResponse[] networkResponseArr = (NetworkResponse[]) obj;
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            iyw iyw = (iyw) this.h.get(i);
            NetworkResponse networkResponse = networkResponseArr[i];
            if (networkResponse == null) {
                iyw.deliverError(new VolleyError("No response reported."));
            } else if (!networkResponse.notModified && networkResponse.statusCode < 400) {
                try {
                    iyw.deliverResponse(iyw.parseNetworkResponse(networkResponse).result);
                } catch (Exception e2) {
                    iyw.deliverError(new VolleyError((Throwable) e2));
                }
            } else {
                iyw.deliverError(new VolleyError(networkResponse));
            }
        }
        this.d.countDown();
    }

    public final byte[] getBody() {
        char c = 0;
        irk.a(this.d.getCount() > 0, (Object) "ApiaryBatchRequest can not be reused.");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream);
        try {
            Map headers = getHeaders();
            int size = this.h.size();
            int i = 0;
            while (i < size) {
                outputStreamWriter.write("--MultiPartRequest\n");
                iyw iyw = (iyw) this.h.get(i);
                outputStreamWriter.write("Content-Type: application/http\n");
                StringBuilder sb = new StringBuilder(31);
                sb.append("Content-ID: <item:");
                sb.append(i);
                sb.append(">\n");
                outputStreamWriter.write(sb.toString());
                outputStreamWriter.write("\n");
                Object[] objArr = new Object[2];
                int method = iyw.getMethod();
                objArr[c] = method != 1 ? method != 2 ? method != 3 ? "GET" : "DELETE" : "PUT" : "POST";
                objArr[1] = iyw.getUrl();
                outputStreamWriter.write(String.format("%s %s\n", objArr));
                HashMap hashMap = iyw.e;
                if (hashMap != null) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (!((String) entry.getValue()).equals(headers.get(entry.getKey()))) {
                            String str = (String) entry.getKey();
                            String str2 = (String) entry.getValue();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
                            sb2.append(str);
                            sb2.append(": ");
                            sb2.append(str2);
                            sb2.append("\n");
                            outputStreamWriter.write(sb2.toString());
                        }
                    }
                }
                byte[] body = iyw.getBody();
                if (body != null) {
                    String bodyContentType = iyw.getBodyContentType();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(bodyContentType).length() + 15);
                    sb3.append("Content-Type: ");
                    sb3.append(bodyContentType);
                    sb3.append("\n");
                    outputStreamWriter.write(sb3.toString());
                    int length = body.length;
                    StringBuilder sb4 = new StringBuilder(28);
                    sb4.append("Content-Length: ");
                    sb4.append(length);
                    sb4.append("\n");
                    outputStreamWriter.write(sb4.toString());
                    String str3 = new String(body);
                    StringBuilder sb5 = new StringBuilder(str3.length() + 2);
                    sb5.append("\n");
                    sb5.append(str3);
                    sb5.append("\n");
                    outputStreamWriter.write(sb5.toString());
                }
                outputStreamWriter.write("\n");
                i++;
                c = 0;
            }
            outputStreamWriter.write("--MultiPartRequest--\n");
            outputStreamWriter.flush();
        } catch (IOException e2) {
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ((Boolean) iks.a.c()).booleanValue();
        return byteArray;
    }

    public final String getBodyContentType() {
        return "multipart/mixed; boundary=MultiPartRequest";
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        String readLine;
        byte[] bArr;
        NetworkResponse[] networkResponseArr = new NetworkResponse[this.h.size()];
        InputStream byteArrayInputStream = new ByteArrayInputStream(networkResponse.data);
        if (jjt.a(networkResponse.data)) {
            try {
                byteArrayInputStream = new GZIPInputStream(byteArrayInputStream);
            } catch (IOException e2) {
            }
        }
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        int i = -1;
        while (true) {
            try {
                String readLine2 = dataInputStream.readLine();
                if (readLine2 != null) {
                    boolean z = true;
                    if (readLine2.startsWith("Content-ID: <response-item:")) {
                        Matcher matcher = e.matcher(readLine2);
                        if (!matcher.matches()) {
                            throw new IOException(readLine2.length() == 0 ? new String("Response ID invalid: ") : "Response ID invalid: ".concat(readLine2));
                        }
                        i = Integer.parseInt(matcher.group(1));
                    }
                    if ("".equals(readLine2)) {
                        if (i >= 0) {
                            String readLine3 = dataInputStream.readLine();
                            Matcher matcher2 = f.matcher(readLine3);
                            if (!matcher2.matches()) {
                                String valueOf = String.valueOf(readLine3);
                                throw new IOException(valueOf.length() == 0 ? new String("Response Code invalid: ") : "Response Code invalid: ".concat(valueOf));
                            }
                            int parseInt = Integer.parseInt(matcher2.group(1));
                            HashMap hashMap = new HashMap();
                            do {
                                readLine = dataInputStream.readLine();
                                Matcher matcher3 = g.matcher(readLine);
                                if (matcher3.matches()) {
                                    hashMap.put(matcher3.group(1), matcher3.group(2));
                                }
                            } while (!"".equals(readLine));
                            if (hashMap.containsKey("Content-Length")) {
                                int parseInt2 = Integer.parseInt((String) hashMap.get("Content-Length"));
                                bArr = new byte[parseInt2];
                                for (int i2 = 0; i2 < parseInt2; i2 += dataInputStream.read(bArr, i2, parseInt2 - i2)) {
                                }
                            } else {
                                bArr = null;
                            }
                            dataInputStream.readLine();
                            if (parseInt != 304) {
                                z = false;
                            }
                            networkResponseArr[i] = new NetworkResponse(parseInt, bArr, hashMap, z);
                            i = -1;
                        } else {
                            throw new IOException("Section ID not provided");
                        }
                    }
                } else {
                    Response success = Response.success(networkResponseArr, getCacheEntry());
                    try {
                        dataInputStream.close();
                    } catch (IOException e3) {
                    }
                    return success;
                }
            } catch (NumberFormatException e4) {
                Response error = Response.error(new VolleyError((Throwable) e4));
                try {
                    dataInputStream.close();
                } catch (IOException e5) {
                }
                return error;
            } catch (IOException e6) {
                Response error2 = Response.error(new VolleyError((Throwable) e6));
                try {
                    dataInputStream.close();
                } catch (IOException e7) {
                }
                return error2;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (IOException e8) {
                }
                throw th;
            }
        }
    }
}
