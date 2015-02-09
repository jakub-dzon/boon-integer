package pl.dzon.boon;

import org.boon.json.JsonParserAndMapper;
import org.boon.json.JsonParserFactory;
import org.junit.Test;

import java.io.InputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class BoonIntegerTest {

    @Test
    public void shouldParseNullInteger() {
        //Given
        JsonParserFactory jsonParserFactory = new JsonParserFactory();
        JsonParserAndMapper parserAndMapper = jsonParserFactory.create();
        InputStream inputStream = this.getClass().getResourceAsStream("/demo.json");

        //When
        Entity entity = parserAndMapper.parse(Entity.class, inputStream);

        //Then
        assertThat(entity.getName(), is("A name"));
        assertThat(entity.getSomeNumber(), is(nullValue()));
    }
}
