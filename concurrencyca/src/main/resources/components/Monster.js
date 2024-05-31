import React from 'react';

const Monster = ({ type }) => {
    return (
        <div className={`monster ${type}`}>
            {type}
        </div>
    );
};

export default Monster;
