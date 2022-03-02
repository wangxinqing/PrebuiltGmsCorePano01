package defpackage;

import android.util.Log;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.ErrorManager;
import java.util.logging.FileHandler;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: ajiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajiy extends ErrorManager implements Filter {
    public final File a;
    private final Handler b;
    private final LogRecord c = new LogRecord(Level.INFO, "");

    public ajiy(File file, int i) {
        if (file == null || !file.isDirectory()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("Incomplete or non-existent dir ");
            sb.append(valueOf);
            Log.e("GCoreUlr", "", new IllegalArgumentException(sb.toString()));
            throw new IllegalArgumentException();
        }
        this.a = file;
        FileHandler fileHandler = new FileHandler(new File(this.a, "log").getAbsolutePath(), i >> 2, 4, true);
        this.b = fileHandler;
        fileHandler.setFormatter(new ajiu());
        this.b.setLevel(Level.ALL);
        this.b.setFilter(this);
        this.b.setErrorManager(this);
    }

    public final synchronized void a() {
        this.b.close();
        if (this.a.exists() && !ajre.a(this.a)) {
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Error deleting ");
            sb.append(valueOf);
            Log.e("GCoreUlr", "", new IOException(sb.toString()));
        }
    }

    public final synchronized void error(String str, Exception exc, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(")");
        Log.e("GCoreUlr", sb.toString(), exc);
    }

    public final boolean isLoggable(LogRecord logRecord) {
        return true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("LogFile{mLogDir=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public final synchronized void a(PrintWriter printWriter) {
        if (!this.a.exists()) {
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("The log file directory does not exist: ");
            sb.append(valueOf);
            Log.w("GCoreUlr", sb.toString());
            return;
        }
        this.b.flush();
        for (int i = 3; i >= 0; i--) {
            File file = this.a;
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("log.");
            sb2.append(i);
            File file2 = new File(file, sb2.toString());
            if (file2.exists()) {
                printWriter.println();
                printWriter.println(String.valueOf(file2.getName()).concat(":"));
                printWriter.println();
                BufferedReader bufferedReader = null;
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            printWriter.println(readLine);
                        } catch (IOException e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            try {
                                Log.w("GCoreUlr", "Exception: ", e);
                                ajnw.a((Closeable) bufferedReader);
                            } catch (Throwable th) {
                                th = th;
                                ajnw.a((Closeable) bufferedReader);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            ajnw.a((Closeable) bufferedReader);
                            throw th;
                        }
                    }
                    ajnw.a((Closeable) bufferedReader2);
                } catch (IOException e2) {
                    e = e2;
                    Log.w("GCoreUlr", "Exception: ", e);
                    ajnw.a((Closeable) bufferedReader);
                } catch (Throwable th3) {
                    th = th3;
                    ajnw.a((Closeable) bufferedReader);
                    throw th;
                }
            }
        }
    }

    public final synchronized void a(Level level, String str, String str2) {
        a(level, str, str2, (Throwable) null);
    }

    public final synchronized void a(Level level, String str, String str2, Throwable th) {
        jhg.c();
        this.c.setMillis(System.currentTimeMillis());
        this.c.setLevel(level);
        this.c.setMessage(String.format("%s: %s", new Object[]{str, str2}));
        this.c.setThrown(th);
        this.b.publish(this.c);
    }

    public final synchronized void a(Level level, String str, Throwable th) {
        a(level, str, "", th);
    }
}
