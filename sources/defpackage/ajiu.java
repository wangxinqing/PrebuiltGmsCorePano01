package defpackage;

import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: ajiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajiu extends Formatter {
    private static final DateFormat a = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss.SSSZ ", Locale.ENGLISH);

    public final String format(LogRecord logRecord) {
        char c;
        PrintWriter printWriter;
        StringBuilder sb = new StringBuilder();
        sb.append(a.format(new Date(logRecord.getMillis())));
        Level level = logRecord.getLevel();
        if (level != Level.FINER) {
            c = level != Level.FINE ? level != Level.INFO ? level != Level.WARNING ? level == Level.SEVERE ? 'E' : '?' : 'W' : 'I' : 'D';
        } else {
            c = 'V';
        }
        sb.append(c);
        sb.append(" ");
        sb.append(formatMessage(logRecord));
        sb.append("\n");
        Throwable thrown = logRecord.getThrown();
        if (thrown != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                printWriter = new PrintWriter(stringWriter);
                try {
                    apev.a(thrown, printWriter);
                    sb.append(stringWriter.toString());
                    ajnw.a((Closeable) printWriter);
                } catch (Throwable th) {
                    th = th;
                    ajnw.a((Closeable) printWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                printWriter = null;
                ajnw.a((Closeable) printWriter);
                throw th;
            }
        }
        return sb.toString();
    }
}
