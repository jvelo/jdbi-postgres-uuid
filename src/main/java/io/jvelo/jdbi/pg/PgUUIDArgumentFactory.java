package io.jvelo.jdbi.pg;

import java.util.UUID;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.Argument;
import org.skife.jdbi.v2.tweak.ArgumentFactory;

/**
 * @version $Id$
 */
public class PgUUIDArgumentFactory implements ArgumentFactory<UUID>
{
    @Override
    public boolean accepts(Class<?> expected, Object value, StatementContext statementContext)
    {
        if (value == null) {
            return false;
        }
        return UUID.class.isAssignableFrom(value.getClass());
    }

    @Override
    public Argument build(Class<?> expected, UUID value, StatementContext statementContext)
    {
        return new PgUUIDArgument(value);
    }
}
