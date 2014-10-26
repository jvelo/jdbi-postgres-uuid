package io.jvelo.jdbi.pg;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.Argument;

/**
 * @version $Id$
 */
public class PgUUIDArgument implements Argument
{
    private UUID value = null;

    public PgUUIDArgument(UUID value)
    {
        this.value = value;
    }

    @Override
    public void apply(int position, PreparedStatement statement, StatementContext statementContext)
            throws SQLException
    {
        statement.setObject(position, new PgUUID(value.toString()));
    }
}
