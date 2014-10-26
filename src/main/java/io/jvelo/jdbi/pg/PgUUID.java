package io.jvelo.jdbi.pg;

/**
 * @version $Id$
 */
public class PgUUID extends org.postgresql.util.PGobject
{
    public static final String UUID_TYPE = "uuid";

    public PgUUID(String s) throws java.sql.SQLException
    {
        super();
        this.setType(UUID_TYPE);
        this.setValue(s);
    }
}
